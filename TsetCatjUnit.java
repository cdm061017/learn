package com.jUnit.learn;

import org.junit.Test;

public class TsetCatjUnit {
	
	@Test
	public void testCry() {
		Cat cat = new Cat();
		cat.cry();
	}
	
	@Test
	public void testCount() {
		Cat cat = new Cat();
		System.out.println(cat.count(4, 5));
	}
}
