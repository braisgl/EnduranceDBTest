import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private static Connection con;

    public static Connection getConnectionToEndurance() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/endurance", "root", "secret");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return con;
    }

    public static void closeAll(ResultSet rs) {
        try {
            con.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
