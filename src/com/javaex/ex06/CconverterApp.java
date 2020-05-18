package com.javaex.ex06;

public class CconverterApp {

	public static void main(String[] args) {

		Cconverter.setRate(1118.70);

		System.out.println("100만원은 " + Cconverter.toDoller(1000000) + "달러입니다.");

		System.out.println("100달러는 " + Cconverter.toKWR(100) + "원 입니다.");

	}

}
