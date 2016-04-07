package com.mydomain;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class HibernateTest {
//	private static SessionFactory sf
	
	@BeforeClass
	public void initHibernate() {
		
	}
	
	@Test
	public void testUserLoading() {

	
			int x = 3+4;
			Assert.assertEquals(12,x);
	}

}
