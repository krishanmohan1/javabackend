package com.capg.java.Maven2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        Connection conn = null;

        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "capgdb";
        String password = "capgdb";

        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Employeeinfo1");

            while (rs.next()) {
                System.out.println("Employee No : " + rs.getInt(1));
                System.out.println("Employee Name: " + rs.getString("ename"));
                System.out.println("Employee sal : " + rs.getInt(3));
            }

        } catch (SQLException s) {
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
