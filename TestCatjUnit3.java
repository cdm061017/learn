package com.jUnit.learn;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCatjUnit3 {
	
	static Cat cat = null;
	//���ò��Ժ���ʱ���Զ����ã����Գ�ʼ��
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

	//���ò��Ժ�������Զ����ã����Ի�����Դ
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

}
