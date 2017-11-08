/**  
 * Project Name:springMybatis  
 * File Name:ItemsMapperTest.java  
 * Package Name:com.hc.mybatis.mapper  
 * Date:2017年11月8日下午5:58:51  
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.hc.mybatis.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hc.mybatis.po.Items;
import com.hc.mybatis.po.ItemsExample;

/**  
 * ClassName:ItemsMapperTest <br/>  
 * Date:     2017年11月8日 下午5:58:51 <br/>  
 * @author   zhangwen  
 * @since    JDK 1.6  
 * @see        
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class ItemsMapperTest {

	@Autowired
	private ItemsMapper mapper;
	@Test
	public void testSelectByPrimaryKey() {
		Items items = mapper.selectByPrimaryKey(1);
		System.out.println(items);
		int id = items.getId();
		assertEquals(1, id);
	}

	@Test
	public void testSelectByExampleWithBLOBs() {
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andIdBetween(1, 2);

		List<Items> list = mapper.selectByExampleWithBLOBs(example);
		System.out.println(list);
		assertEquals(2, list.size());
	}
}
  
