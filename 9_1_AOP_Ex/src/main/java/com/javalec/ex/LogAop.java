package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		//여기가 바로 프록시 입니다
		
		
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is strat");
		long st = System.currentTimeMillis();
		
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}

}
