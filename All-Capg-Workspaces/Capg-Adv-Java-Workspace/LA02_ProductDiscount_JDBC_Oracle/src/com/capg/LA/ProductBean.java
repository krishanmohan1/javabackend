package com.capg.LA;


	import java.io.Serializable;

	public class ProductBean implements Serializable {

	    private int pid;
	    private String pname;
	    private double price;
	    private double discount;

	    public ProductBean() {

	    }

	    public int getPid() {
	        return pid;
	    }

	    public void setPid(int pid) {
	        this.pid = pid;
	    }

	    public String getPname() {
	        return pname;
	    }

	    public void setPname(String pname) {
	        this.pname = pname;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public double getDiscount() {
	        return discount;
	    }

	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }
	}


