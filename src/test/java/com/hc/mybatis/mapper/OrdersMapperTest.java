package com.hc.mybatis.mapper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hc.mybatis.po.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class OrdersMapperTest {
	@Autowired
	private OrdersMapper mapper;

	@Test
	public void testSelectByPirmaryKey() {
		Orders orders = mapper.selectByPrimaryKey(5);
		assertTrue(orders != null);
		System.out.println(orders.getId());
	}
}
