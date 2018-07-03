package com.Util;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class UtilityHelper {
	public static Session getSession(){
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		return session;
	}

	
}
