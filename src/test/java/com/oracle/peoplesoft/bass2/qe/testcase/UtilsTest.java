package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oracle.peoplesoft.bass2.qe.utility.Constants;
import com.oracle.peoplesoft.bass2.qe.utility.Utils;

public class UtilsTest {

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
	public void testOpenBrowser() {
		Utils.openBrowser(Constants.BugAU_URL); 
	}

}
