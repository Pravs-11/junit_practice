package com.junitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testunit {
test t1=new test();
@Test
@DisplayName("pravallika")
public void big() {
	
	int exp=6;
	int res=t1.biggest(5, 6);
	assertEquals(exp,res);
}
@Test
public void big1() {
	assertNotEquals(5,t1.biggest(5, 6));
}
@Test
public void checkname() {
	assertSame("welcome",t1.pravallika());
}
@Test
public void checkname1() {
	assertNotSame("Welcome",t1.pravallika());
}
@Test
public void eventest() {
	boolean res=t1.even(6);
	assertTrue(res);
}
@Test
@DisplayName("not even")
public void eventest1() {
	boolean res=t1.even(7);
	assertFalse(res);
}


}
