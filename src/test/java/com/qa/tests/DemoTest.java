package com.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

@Test
public void sum() {
	int a=10;
	int b=20;
	System.out.println("SUM");
Assert.assertEquals(30, a+b);
}
@Test
public void sub() {
	int a=10;
	int b=20;
	System.out.println("SUB");
Assert.assertEquals(10, b-a);
}
@Test
public void mul() {
	int a=10;
	int b=20;
	System.out.println("MUL");
Assert.assertEquals(200, a*b);
}
@Test
public void div() {
	int a=10;
	int b=20;
	System.out.println("DIV");
Assert.assertEquals(2, b/a);
}
}
