package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {
	
	/**
	 * @Test
	 * @Test(expected=XX.class)
	 * @Test(timeout=毫秒)
	 * @BeforeClass -- static 修饰
	 * @AfterClass -- static休息
	 * @Before -- 每个Test之前运行
	 * @After
	 * 
	 * @ignore
	 * @RunWith:可以更改测试运行器 - 继承该类 org.junit.runner.Runner
	 * @Assert
	 * 
	 * @throws Exception
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test(expected=ArithmeticException.class,timeout=2000)
	public void testDivide() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, new Calculate().divide(3, 0));
	}
	
	@Test(timeout=2000)
	@Ignore("not run")
	public void testWhile() {
		while(true) {
			System.out.println("run forever ...");
		}
	}
	@Test(timeout=2000)
	public void testReadFile(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
