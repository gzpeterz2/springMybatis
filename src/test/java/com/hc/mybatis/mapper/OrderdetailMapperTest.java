package com.hc.mybatis.mapper;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hc.mybatis.po.Orderdetail;

public class OrderdetailMapperTest {
	private static ApplicationContext applicationContext;
	private static OrderdetailMapper mapper;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new 
				ClassPathXmlApplicationContext("spring/applicationContext.xml");
		mapper = (OrderdetailMapper) applicationContext.getBean("orderdetailMapper");
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
	}

	@Test
	public void testSelectByPrimaryKey() {
		Orderdetail odetail = mapper.selectByPrimaryKey(1);
		assertTrue(odetail != null);
		System.out.println(odetail.getOrdersId());
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testUpdateByPrimaryKey() {
	}

}
