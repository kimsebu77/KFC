import java.sql.*;

public class fighter {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/ufcfighter","root","07080427kr");
            System.out.println("DB연결 OK");
            String sql="INSERT INTO feather (name, rich, height, weight, WIN, LOSE, attackaccuracy,takedownaccuracy, KO_TKO, fighter_RANK) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,"볼카노프스키");
            stmt.setInt(2, 170);//리치
            stmt.setInt(3, 171);//키
            stmt.setInt(4, 61);//무게
            stmt.setInt(5, 20);//승리
            stmt.setInt(6, 5);//패배
            stmt.setDouble(7, 55);//타격 정확도
            stmt.setDouble(8, 49);//택다운정확도
            stmt.setInt(9, 7);//KO/TKO
            stmt.setString(10, "C");//랭크
            stmt.executeUpdate();
//            stmt.executeUpdate(
//                    "delete from bantam where id=1"
//            );
//            stmt.executeUpdate(
//                    "Update bantam set id=1 where name='"+"페트르 얀"+"'"
//            );
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

    }
}
