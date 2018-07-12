package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {
	
	/**
	 * @BeforeClass 修饰的方法会在所有方法调用前被调用，而且该方法是静态，所有当测试类被夹在后
	 * @AfterClass
	 * 
	 * @Befor
	 * @after --会在背个Test前后各运行一次
	 * 
	 * @throws Exception
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after");
	}


	
	@Test
	public void test1() {
		System.out.println("Test is test1");
	}
	@Test
	public void test2() {
		System.out.println("Test is test2");
	}

}
