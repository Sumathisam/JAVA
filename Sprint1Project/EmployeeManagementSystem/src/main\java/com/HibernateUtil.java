package com;

import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static org.hibernate.SessionFactory SessionFactory;
	static {
	try {
	SessionFactory = new Configuration().configure().buildSessionFactory();
	} catch (Exception e) {
	System.out.println(e);
	}
	}
	public static org.hibernate.SessionFactory getSessionFactory() {
	return SessionFactory;
	}

        
    }
