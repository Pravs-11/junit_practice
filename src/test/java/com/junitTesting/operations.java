package com.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class operations {

	@Test
	public void test() {
		App a1=new App();
		int res=a1.sum(2,3);
		assertEquals(5,res);
	}
	@Test
	public void testsub() {
		App a1=new App();
		int res=a1.sub(10,5);
		assertEquals(5,res);
		
	}
	@Test
	public void testmul() {
		App a1=new App();
		int res=a1.mul(3, 6);
		assertEquals(18,res);
	}
	@Test
	public void testsquare() {
		App a1=new App();
		int res=a1.square(4);
		assertEquals(16,res);
	}

}
