package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {
	
	/**
	 * @BeforeClass ���εķ����������з�������ǰ�����ã����Ҹ÷����Ǿ�̬�����е������౻���ں�
	 * @AfterClass
	 * 
	 * @Befor
	 * @after --���ڱ���Testǰ�������һ��
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
