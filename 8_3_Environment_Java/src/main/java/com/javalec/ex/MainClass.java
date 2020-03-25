package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connction = ctx.getBean("adminConfig", AdminConnection.class);
		
		System.out.println("admin ID : " + connction.getAdminId());
		System.out.println("admin PW : " + connction.getAdminPw());
		System.out.println("admin sub_ID : " + connction.getSub_adminId());
		System.out.println("admin sub_PW : " + connction.getSub_adminPw());
		
		ctx.close();
	}
	
}
