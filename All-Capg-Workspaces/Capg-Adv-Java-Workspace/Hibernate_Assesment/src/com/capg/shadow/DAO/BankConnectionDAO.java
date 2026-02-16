package com.capg.shadow.DAO;
import org.hibernate.Configration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class BankConnectionDAO {
	public static void main(String[] args) {
		Configration cfg = new Configration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		
	}

}
