/**  
 * Project Name:springMybatis  
 * File Name:UserMapperTest.java  
 * Package Name:com.hc.mybatis.mapper  
 * Date:2017年11月8日下午4:03:13  
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.hc.mybatis.mapper;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hc.mybatis.po.User;

/**  
 * ClassName:UserMapperTest <br/>  
 * Date:     2017年11月8日 下午4:03:13 <br/>  
 * @author   zhangwen  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserMapperTest {
	
	@Autowired
	private UserMapper mapper;

	@Test
	public void testSelectById() {
		User user = null;
		try {
			user = mapper.selectById(10);
		} catch (SQLException e) {
			e.printStackTrace();  
		}
		System.out.println(user);
	}
}
  
