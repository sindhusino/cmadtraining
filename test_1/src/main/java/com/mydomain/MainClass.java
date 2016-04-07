package com.mydomain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mydomain.model.Users;


public class MainClass {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		
		Users users = new Users();
		users.setName("SINDHU");
		users.setState("Hi");
		users.setAge(20);
		Session session = sessionFactory.openSession();
		session.save(users);
		List<Users> userList = session.createQuery("select u from Users u").list();
		System.out.println(userList.toString());
		
		session.close();
	}

}
