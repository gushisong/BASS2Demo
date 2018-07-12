package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	/**
	 * 1.更改默认的运行器@RunWith(Parameterized.class)
	 * 2.声明变量用来存储预期值
	 * 3.声明一个
	 */
	int expected=0;
	int input1=0;
	int input2=0;
	@Parameters
	public static Collection<Object []>t(){
		return Arrays.asList(new Object[][]{
			{3,1,2},{4,2,2}
		});
	}
	
	public ParameterTest(int expected,int input1,int input2) {
		this.expected=expected;
		this.input1=input1;
		this.input2=input2;
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testAdd() {
		assertEquals(expected, new Calculate().add(input1, input2));
	}

}
