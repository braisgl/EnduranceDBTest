package Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;
    public static Connection getConnectionToEndurance() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/endurance","root", "secret");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return connection;
    }
}
