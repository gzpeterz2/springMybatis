package com.hc.mybatis.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hc.mybatis.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserDaoImplTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testSelectById() throws SQLException {
		// UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.selectById(22);
		assertTrue(user != null);
		System.out.println(user);
	}
}
