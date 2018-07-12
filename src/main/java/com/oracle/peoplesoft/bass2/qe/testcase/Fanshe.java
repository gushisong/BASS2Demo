package com.oracle.peoplesoft.bass2.qe.testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Fanshe {
	
	public static void main(String[] args) {

//		Calculate calculate=new Calculate();
//		Class calClass=calculate.getClass();
//		System.out.println(calClass.getName());
//		
//		Class cla1=Calculate.class;
//		System.out.println(cla1.getName());
		
		
		try {
			Class class1=Class.forName("com.oracle.peoplesoft.bass2.qe.testcase.Person");
			Method[] methods=class1.getMethods();
			System.out.println("Method Lists");
			for(Method m:methods) {
				System.out.println(m.toString());
			}
			System.out.println("Field Lists");
			Field[] fields=class1.getDeclaredFields();
			for(Field f:fields) {
				System.out.println(f.toString());
			}
			System.out.println("Constructor Lists");
			Constructor[] constructors=class1.getDeclaredConstructors();
			for(Constructor c:constructors) {
				System.out.println(c.toString());
			}
			
			
			Class class2=Class.forName("com.oracle.peoplesoft.bass2.qe.testcase.Person");
			
			Person person=(Person) class2.newInstance();
			person.setName("ÕÅÈý");
			person.setAge(16);
			person.setGender("ÄÐ");
			System.out.println(person.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
//				
	}

}
