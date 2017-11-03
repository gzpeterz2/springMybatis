package com.hc.mybatis.mapper;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hc.mybatis.po.Orders;

public class OrdersMapperTest {
	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new 
			ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
	public void testSelectByPirmaryKey() {
		OrdersMapper mapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
		Orders orders = mapper.selectByPrimaryKey(5);
		assertTrue(orders != null);
		System.out.println(orders.getId());
	}
}
