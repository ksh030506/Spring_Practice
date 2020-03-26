package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		//여기가 바로 프록시 입니다
		
		
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is strat");
		long st = System.currentTimeMillis();
		
		
		try {
			Object obj = joinpoint.proceed();  //대상의 핵심코드가 실행된다 즉 메소드가 실행된다
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}

}


//공통기능