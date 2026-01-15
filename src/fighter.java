import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class fighter {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/kfc","root","07080427kr");
            System.out.println("DB연결 OK");
            Statement stmt=conn.createStatement();;
            String name="이스라엘 아데산야";
            String plus="insert into ufcfighter values('"+name+"'"+")";
            stmt.executeUpdate(plus);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

    }
}
