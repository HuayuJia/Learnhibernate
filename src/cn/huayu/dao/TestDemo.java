package cn.huayu.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.huayu.entity.User;
import cn.huayu.utils.HibernateUtils;

public class TestDemo {
	@Test
	public void testAdd()
	{
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	User user = new User();
	user.setName("ะกร๗");
	user.setAge(20);
	user.setPassword("123");
	session.save(user);
	tx.commit();
	session.close();
	sessionFactory.close();
	}
	
}
