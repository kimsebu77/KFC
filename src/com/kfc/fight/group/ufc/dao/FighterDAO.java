package com.kfc.fight.group.ufc.dao;

import com.kfc.fight.config.DBUtil;
import com.kfc.fight.group.ufc.model.Fighter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FighterDAO {
    public Fighter findByName(String name) {
        String sql = "SELECT * FROM fighter WHERE name = ?";

        try {
            Connection conn = DBUtil.getFighterConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Fighter(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("rich"),
                        rs.getInt("height"),
                        rs.getInt("weight"),
                        rs.getInt("win"),
                        rs.getInt("lose"),
                        rs.getDouble("attackaccuracy"),
                        rs.getDouble("takedownaccuracy"),
                        rs.getInt("ko_tko"),
                        rs.getInt("fighter_rank")
                );
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
