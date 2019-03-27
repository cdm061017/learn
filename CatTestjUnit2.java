package com.jUnit.learn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CatTestjUnit2 {
	
	Cat cat = null;
	//SetUp��ʾ��ʼ�����ᱻjUnit�Զ�����
	@Before
	public void setUp() throws Exception {
		cat = new Cat();
		System.out.println("SetUp()...");
	}
	
	//tearDown��ʾ����Դ����
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
