package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConector {

        public static Connection getJDBCConnector() {

            final String url = "jdbc:sqlserver://localhost:1433;databaseName=VUONSENDA;user=sa;password=123456";

            try {
               // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                return DriverManager.getConnection(url);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

    public static void main(String[] args) {
        Connection connection = getJDBCConnector();
            if(connection != null)
                System.out.println("thanh cong");
            else
                System.out.println("That bai");
    }

}

