package com.hc.mybatis.mapper;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hc.mybatis.po.Items;
import com.hc.mybatis.po.ItemsExample;

public class ItemsMapperTest {

	private static ApplicationContext applicationContext;
	private static ItemsMapper mapper;

	@BeforeClass
	public static void init() throws Exception {
		applicationContext = new
			ClassPathXmlApplicationContext("spring/applicationContext.xml");
		mapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
	}
	
	@Ignore
	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() throws SQLException {

		Items items = mapper.selectByPrimaryKey(1);
		// mapper.selectByExample(example)
		
		assertTrue(items != null);
		System.out.println(items.getName());
	}
	
	@Test
	public void testSelectByExample() throws SQLException {
		
		ItemsExample itemsExample = new ItemsExample();
		ItemsExample.Criteria  criteria = itemsExample.createCriteria();
		
		criteria.andIdBetween(1, 2);
		criteria.andNameLike("%台式%");
		List<Items> list = mapper.selectByExample(itemsExample);
		
		assertTrue(list != null);
		System.out.println(list);
		System.out.println(list.get(0).getId());
	}
}
