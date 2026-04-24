package lpl_manage2026;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/ipl_db";

    private static final String USER = "root";
    private static final String PASS = "@saundarya9042";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASS);

            if (con != null) {
                System.out.println("Database Connected Successfully");
            }

            return con;

        } catch (Exception e) {
            System.out.println(" DB Connection Failed");
            e.printStackTrace();
        }

        return null;
    }
}