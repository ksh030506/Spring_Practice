package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String config = null;
		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(str.contentEquals("dev")) {
			config = "dev";
		} else if(str.contentEquals("run")) {
			config = "run";
		}
		
		
		
		in.close();
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + serverInfo.getIpNum());
		System.out.println("port : " + serverInfo.getPortNum());
		
		
		ctx.close();
	}
}
