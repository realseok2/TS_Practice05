package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member customer01 = new Member();
		Member customer02 = new Member();
		Member customer03 = new Member();
		
		customer01.setId("JWS");
		customer01.setName("정우성");
		customer01.setPoint(500000);
		customer01.showInfo();
		
		customer02.setId("YJS");
		customer02.setName("유재석");
		customer02.setPoint(300000);
		customer02.showInfo();
		
		customer03.setId("LHR");
		customer03.setName("이효리");
		customer03.setPoint(100000);
		customer03.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
