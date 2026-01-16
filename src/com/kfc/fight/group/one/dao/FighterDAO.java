package com.kfc.fight.group.one.dao;

import com.kfc.fight.config.DBUtil;
import com.kfc.fight.group.ufc.model.Fighter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FighterDAO {

    public Fighter findByName(String name) {
        // 모든 체급이 'fighter' 테이블에 통합되었으므로 쿼리가 단순해집니다.
        String sql = "SELECT * FROM onefighter.fighter WHERE name = ?";

        try (
                Connection conn = DBUtil.getFighterConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // DB 컬럼명과 rs.get... 안의 이름을 정확히 맞춰야 합니다.
                return new Fighter(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("weight_class"), // 새로 추가한 컬럼
                        rs.getInt("height"),
                        rs.getInt("weight"),
                        rs.getInt("win"),
                        rs.getInt("lose"),
                        rs.getInt("finishes"),
                        rs.getString("avg_")
                        rs.getDouble("attackaccuracy"),
                        rs.getDouble("takedownaccuracy"),
                        rs.getInt("KO_TKO"), // DB 생성문이 대문자였으므로 맞춰줌
                        rs.getString("fighter_RANK") // DB 생성문이 대문자였으므로 맞춰줌
                );
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}