package com.hc.mybatis.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hc.mybatis.po.User;

public class UserDaoImplTest {
	
	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() throws Exception {
		applicationContext = new 
			ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Ignore
	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() throws SQLException {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.selectById(22);
		assertTrue(user != null);
		System.out.println(user);
	}

}
