package com.capg.LA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {

    int i;

    public int addProduct(ProductBean productBean) throws ClassNotFoundException {

        System.out.println("Product DAO Layer");
        System.out.println("ProductID : " + productBean.getPid());
        System.out.println("ProductName : " + productBean.getPname());
        System.out.println("Product Price : " + productBean.getPrice());
        System.out.println("Product Discount : " + productBean.getDiscount());

        try {
            Connection conn = null;

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String driver = "oracle.jdbc.driver.OracleDriver";
            String userName = "capgdb";
            String password = "capgdb";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);

            String query = "insert into product values(?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, productBean.getPid());
            pstmt.setString(2, productBean.getPname());
            pstmt.setDouble(3, productBean.getPrice());
            pstmt.setDouble(4, productBean.getDiscount());

            i = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return i;
    }
}
