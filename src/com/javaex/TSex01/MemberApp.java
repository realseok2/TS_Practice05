package com.javaex.TSex01;

public class MemberApp {

	public static void main(String[] args) {

		Member customerNo01 = new Member();
		Member customerNo02 = new Member();
		Member customerNo03 = new Member();

		customerNo01.setName("정우성");
		customerNo01.setId("JWS");
		customerNo01.setPoint(50000);
		customerNo01.showInfo();

		customerNo02.setName("유재석");
		customerNo02.setId("YJS");
		customerNo02.setPoint(40000);
		customerNo02.showInfo();

		customerNo03.setName("이효리");
		customerNo03.setId("LHR");
		customerNo03.setPoint(30000);
		customerNo03.showInfo();

	}

}
