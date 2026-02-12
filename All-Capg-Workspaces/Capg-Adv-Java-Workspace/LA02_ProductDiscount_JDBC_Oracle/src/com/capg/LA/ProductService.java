package com.capg.LA;

public class ProductService {

    double discount;

    public int addProduct(int pid, String pname, double price) throws ClassNotFoundException {

        System.out.println("This is ProductService");
        System.out.println(pid + pname + price);

        if (price <= 1000) {
            discount = 5;
        } else if (price > 1000 && price <= 10000) {
            discount = 10;
        } else if (price > 10000 && price <= 50000) {
            discount = 15;
        } else {
            discount = 20;
        }

        ProductBean productBean = new ProductBean();
        productBean.setPid(pid);
        productBean.setPname(pname);
        productBean.setPrice(price);
        productBean.setDiscount(discount);

        ProductDAO productDAO = new ProductDAO();
        int k = productDAO.addProduct(productBean);

        return k;
    }
}