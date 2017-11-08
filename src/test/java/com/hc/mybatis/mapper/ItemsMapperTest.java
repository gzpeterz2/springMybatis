package com.hc.mybatis.mapper;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hc.mybatis.po.Items;
import com.hc.mybatis.po.ItemsExample;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
// @ContextConfiguration(locations={"file1", "file2"})
public class ItemsMapperTest {

	@Autowired
	private ItemsMapper mapper;

	@Ignore
	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testSelectByPrimaryKey() throws SQLException {

		Items items = mapper.selectById(1);
		// mapper.selectByPrimaryKey(1);
		// mapper.selectByExample(example)
		
		assertTrue(items != null);
		System.out.println(items.getName());
	
	}
}
