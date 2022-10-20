package Domain;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Endurance {

    private static DBQueries query;
    public static void main(String[] args) throws SQLException {
        query = new DBQueries();
        ResultSet rs = query.getProject(1);
        while(rs.next()){
            System.out.println(rs.getString("description"));
        }
    }

}