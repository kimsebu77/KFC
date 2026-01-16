package com.kfc.fight.group.one.dao;

import com.kfc.fight.config.DBUtil;
import com.kfc.fight.group.one.model.Fighter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RankingDAO {
    public List<Fighter> getRankingsByWeightClass(String weightClass) {
        List<Fighter> list = new ArrayList<>();
        // 랭킹 순(C -> 1 -> 2)으로 정렬하여 가져오기
        // C(챔피언)가 가장 먼저 나오게 하려면 정렬 로직이 필요하지만,
        // 우선은 fighter_rank 순으로 정렬합니다.
        String sql = "SELECT * FROM onefighter.fighter WHERE weight_class = ? ORDER BY " +
                "CASE " +
                "WHEN fighter_rank = 'C' THEN 0 " +
                "WHEN fighter_rank = 'U' THEN 2 " +
                "ELSE 1 END, " +
                "CAST(fighter_rank AS UNSIGNED) ASC";

        try (Connection conn = DBUtil.getFighterConnection2();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, weightClass);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Fighter(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("weight_class"),
                        rs.getInt("height"),
                        rs.getInt("weight"),
                        rs.getInt("win"),
                        rs.getInt("lose"),
                        rs.getInt("finishes"),
                        rs.getString("AVG_Duration"),
                        rs.getString("fighter_RANK"),
                        rs.getString("striking")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}