package com.oracle.peoplesoft.bass2.qe.testcase;

import java.security.acl.Permission;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	
	public Person() {
		
	}

	public Person(String name,String gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		 return "����:"+name+"  �Ա�:"+gender+"  ����:"+age;
		
	}
	
}
