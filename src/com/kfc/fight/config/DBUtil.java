package com.kfc.fight.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getEventConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ufcevent",
                "root",
                "07080427kr"
        );
    }

    public static Connection getFighterConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ufcfighter",
                "root",
                "07080427kr"
        );
    }
}