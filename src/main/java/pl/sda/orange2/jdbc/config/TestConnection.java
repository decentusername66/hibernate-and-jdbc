package pl.sda.orange2.jdbc.config;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        String query = """
                SELECT ID, NAME
                FROM TEST
                """;
        try {
            var h2Connection = DriverManager.getConnection(H2Config.DB_URL,
                    H2Config.USER,
                    H2Config.PASSWORD);
            System.out.println("got connection: "+(h2Connection != null));

            Statement queryStatement = h2Connection.createStatement();
            ResultSet queryResult = queryStatement.executeQuery(query);
            queryResult.next();
            System.out.println("id: "+queryResult.getInt(1));
            System.out.println("name: "+queryResult.getString((2)));
        } catch (SQLException exc) {
            System.out.println("got exception: "+exc);
            exc.printStackTrace();
        }
    }
}
