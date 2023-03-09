import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBAccess {
    public static void getConnection(String brand) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseurl = "jdbc:mysql://localhost:3306/sports_stocks";
            String username = "root";
            String password = "";
            String query = "select * from stocks where brand = 'adidas'";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseurl, username, password);
            System.out.println("Database connected");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getInt(1)); //or rs.getString("column name");
                System.out.print(", "+rs.getString(2)); //or rs.getString("column name");
                System.out.print(", "+rs.getString(3)); //or rs.getString("column name");
                System.out.print(", "+rs.getString(4)); //or rs.getString("column name");
                System.out.println(", "+rs.getString(5)); //or rs.getString("column name");
            }
            st.close();
            conn.close();
//            System.out.println("Closed");
        } catch (Exception e) {
            System.out.println(e);
        }
        //return null;
    }
}
