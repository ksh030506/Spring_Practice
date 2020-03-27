package com.javalec.ex;

public class Worker {

	private String name;
	private int age;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	// 공통 코드 실행 => LogAop 실행
	public void getWorkerInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("직업 : " + getJob());
	}  //핵심 코드 대상 => 메소드
	// 공통 코드 실행 => LogAop 실행
}
