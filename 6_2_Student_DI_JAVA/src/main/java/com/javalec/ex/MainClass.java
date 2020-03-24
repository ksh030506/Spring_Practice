package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		
		
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("이름 : " + student2.getName());
	}
}
