package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		
		Student s = ctx.getBean("student", Student.class);
		System.out.println(s.getName());
		
		ctx.close();
		
	}
	
}
