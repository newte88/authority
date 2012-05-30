package com.chenxin.authority.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chenxin.authority.pojo.Criteria;
import com.chenxin.authority.pojo.Tree;
import com.chenxin.authority.service.BaseModulesService;

/**
 * 
 * 
 * @author chenxin
 * @date 2011-12-7 下午2:27:04
 */
public class BaseModulesServiceTest extends ServicesTest {

	@Autowired
	private BaseModulesService baseModulesService;

	@Test
	public void selectAllModules() {
		Criteria criteria = new Criteria();
		Tree tree = baseModulesService.selectAllModules(criteria);
		assertNotNull(tree);
	}
}
