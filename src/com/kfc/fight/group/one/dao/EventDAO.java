package com.kfc.fight.group.one.dao;

import com.kfc.fight.config.DBUtil;
import com.kfc.fight.group.one.model.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {

    public List<Event> findAll() {
        String sql = "SELECT * FROM numEvent";
        List<Event> list = new ArrayList<>();

        try {
            Connection conn = DBUtil.getEventConnection2();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Event(
                        rs.getInt("id"),
                        rs.getString("num"),
                        rs.getString("date"),
                        rs.getString("location")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }


}
