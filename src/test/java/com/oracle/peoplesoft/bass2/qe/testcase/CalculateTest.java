package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

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

	@Test
	public void Test() {
		
	}
	@Test
	public void testAdd() {
		assertEquals(6, new Calculate().add(3, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(0, new Calculate().subtract(3, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(9, new Calculate().multiply(3, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(1, new Calculate().divide(3, 3));
	}

}
