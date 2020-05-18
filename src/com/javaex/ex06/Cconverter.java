package com.javaex.ex06;

public class Cconverter {

	public static double rate;

	public static void setRate(double r) {
		Cconverter.rate = r;
	}

	public static double toDoller(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

}
