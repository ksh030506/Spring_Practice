package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();   //컨테이너 생성
		
		ctx.load("classpath:applicationCTX.xml");  //컨테이너 설정
		
		ctx.refresh();  //load로 설정한 경우에는 꼭 해줘야 한다
		
		Student student = ctx.getBean("student1", Student.class);
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		ctx.close();    //자원해제
	}
}
