package com.kfc.fight.group.ufc.dao;

import com.kfc.fight.config.DBUtil;
import com.kfc.fight.group.ufc.model.Fighter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RankingDAO {
    public List<Fighter> getRankingsByWeightClass(String weightClass) {
        List<Fighter> list = new ArrayList<>();
        // 랭킹 순(C -> 1 -> 2)으로 정렬하여 가져오기
        // C(챔피언)가 가장 먼저 나오게 하려면 정렬 로직이 필요하지만,
        // 우선은 fighter_rank 순으로 정렬합니다.
        String sql = "SELECT * FROM ufcfighter.fighter WHERE weight_class = ? ORDER BY " +
                "CASE WHEN fighter_rank = 'C' THEN 0 ELSE CAST(fighter_rank AS UNSIGNED) END ASC";

        try (Connection conn = DBUtil.getFighterConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, weightClass);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Fighter(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("weight_class"),
                        rs.getInt("rich"),
                        rs.getInt("height"),
                        rs.getInt("weight"),
                        rs.getInt("win"),
                        rs.getInt("lose"),
                        rs.getDouble("attackaccuracy"),
                        rs.getDouble("takedownaccuracy"),
                        rs.getInt("KO_TKO"),
                        rs.getString("fighter_RANK")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}