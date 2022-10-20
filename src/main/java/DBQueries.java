import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBQueries {
    Connection con;
    ResultSet rs;

    public ResultSet getProjectById(Connection con, int id) throws SQLException {
        String query = "SELECT * FROM project WHERE ID=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            rs = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
