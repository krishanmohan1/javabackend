package com.capg.LA;

public class ProductController {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            int pid = 201;
            String pname = "Laptop";
            double price = 55000;

            ProductService productService = new ProductService();
            int result = productService.addProduct(pid, pname, price);

            System.out.println("ProductController return value for db : " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
