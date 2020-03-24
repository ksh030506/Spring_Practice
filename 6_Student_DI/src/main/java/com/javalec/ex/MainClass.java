package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation1 = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX1.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());	//홍길동
		System.out.println(student1.getAge());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println(student1.getHobbys());	// 수영, 요리
		System.out.println("==========================================");

		
		StudentInfo studentInfo = ctx.getBean("sutudentInfo1", StudentInfo.class);
		Student student2 = studentInfo.getStudent();	//student1  == student2
		System.out.println(student2.getName());	//홍길동
		System.out.println(student2.getAge());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println(student2.getHobbys());	// 수영, 요리
		System.out.println("==========================================");
		
		if(student1.equals(student2)) {
			System.out.println("==========================================");
			System.out.println("student1 == student2");
			System.out.println("==========================================");
		}
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());	
		System.out.println(student3.getAge());
		System.out.println(student3.getHeight());
		System.out.println(student3.getWeight());
		System.out.println(student3.getHobbys());
		System.out.println("==========================================");
		
		if(student1.equals(student3)) {
			System.out.println("==========================================");
			System.out.println("student1 == student3");
			System.out.println("==========================================");
		} else {
			System.out.println("==========================================");
			System.out.println("student1 != student3");
			System.out.println("==========================================");
		}
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
		
		ctx.close();
		
	}
	
}
