package com.jUnit.learn;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCatjUnit3 {
	
	static Cat cat = null;
	//调用测试函数时会自动调用，可以初始化
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cat = new Cat();
		System.out.println("setUpBeforeClass()");
	}
	
	@Test
	public void testCry() {
		cat.cry();
	}
	
	@Test
	public void testCount() {
		System.out.println(cat.count(4, 5));
	}

	//调用测试函数后会自动调用，可以回收资源
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

}
