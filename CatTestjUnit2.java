package com.jUnit.learn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CatTestjUnit2 {
	
	Cat cat = null;
	//SetUp表示初始化，会被jUnit自动调用
	@Before
	public void setUp() throws Exception {
		cat = new Cat();
		System.out.println("SetUp()...");
	}
	
	//tearDown表示把资源回收
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()...");
	}
	
	@Test
	public void testCry() {
		
		cat.cry();
	}
	
	@Test
	public void testCount() {
		
		System.out.println(cat.count(4, 5));
	}

}
