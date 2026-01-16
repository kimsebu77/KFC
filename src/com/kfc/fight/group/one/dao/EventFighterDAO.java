package com.kfc.fight.group.one.dao;

import com.kfc.fight.config.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class EventFighterDAO {

    public Map<Integer, Map<String, List<String>>> getFightCard(int eventId) {
        // Integer(fightNo)를 키로 하여 경기 번호 순서대로 정렬 (TreeMap 사용 권장)
        Map<Integer, Map<String, List<String>>> fightMap = new TreeMap<>();

        String sql = """
            SELECT ef.fight_type, ef.fight_no, f.name
            FROM oneevent.eventFighter ef
            JOIN onefighter.fighter f ON ef.fighterId = f.id
            WHERE ef.eventId = ?
            ORDER BY ef.fight_no ASC
            """;

        try (
                Connection conn = DBUtil.getEventConnection2();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setInt(1, eventId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int fightNo = rs.getInt("fight_no");
                String fightType = rs.getString("fight_type");
                String name = rs.getString("name");

                fightMap
                        .computeIfAbsent(fightNo, k -> new HashMap<>())
                        .computeIfAbsent(fightType, k -> new ArrayList<>())
                        .add(name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return fightMap;
    }
}
