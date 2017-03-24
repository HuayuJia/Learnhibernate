package cn.huayu.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static Configuration config = null;
	private static SessionFactory sessionFactory = null;
	static{
		config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
