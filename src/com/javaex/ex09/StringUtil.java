package com.javaex.ex09;

public class StringUtil {

	public static String concatString(String[] Array) {

		// 메소드 내용작성

		String result = "";

		for (int i = 0; i < Array.length; i++) {
			result = result + Array[i];
		}

		return result;

	}

}
