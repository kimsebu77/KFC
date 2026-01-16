package com.kfc.fight.group.one.dao;

import com.kfc.fight.config.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EventFighterDAO {

    public Map<String, Map<Integer, List<String>>> getFightCard(int eventId) {
        Map<String, Map<Integer, List<String>>> cardMap = new LinkedHashMap<>();

        // fight_no를 명시적으로 가져옴
        String sql = """
                SELECT ef.card_type, ef.fight_no, f.name
                FROM ufcEvent.eventFighter ef
                JOIN ufcfighter.fighter f ON ef.fighterId = f.id
                WHERE ef.eventId = ?
                ORDER BY ef.card_type, ef.fight_no
            """;

        try (
                Connection conn = DBUtil.getEventConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setInt(1, eventId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String cardType = rs.getString("card_type");
                int fightNo = rs.getInt("fight_no"); // DB의 경기 번호 사용
                String name = rs.getString("name");

                cardMap
                        .computeIfAbsent(cardType, k -> new LinkedHashMap<>())
                        .computeIfAbsent(fightNo, k -> new ArrayList<>())
                        .add(name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return cardMap;
    }
}
