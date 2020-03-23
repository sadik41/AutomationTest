package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1
{
    public static void main(String[] args) throws SQLException {

        // step1
        Connection connection= DriverManager.getConnection("");

        // step2
        Statement statement=connection.createStatement();

        // step3: execute sql statement

        statement.executeQuery("");

        // close

        connection.close();

        System.out.println("program is exited");

    }
}
