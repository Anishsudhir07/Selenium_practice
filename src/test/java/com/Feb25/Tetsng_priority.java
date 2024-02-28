package com.Feb25;

import org.testng.annotations.Test;

public class Tetsng_priority {
	@Test(priority = 0,invocationCount = 1)
	public void test1()
	{
		System.out.println("This is my first program");
	}
	@Test(priority =3, invocationCount = 3)
	public void test2()
	{
		System.out.println("This is my second program");
	}
	
	@Test(priority =2, invocationCount =2)
	public void test3()
	{
		System.out.println("This is my third program");
	}

}
