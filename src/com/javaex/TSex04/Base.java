package com.javaex.TSex04;

public class Base {

	public void service(String state) {
		// 코드작성할것
		if (state == "낮") {
			day();
		} else if (state == "밤") {
			night();
		} else if (state == "오후") {
			afternoon();
		} else {
			System.out.println("잘못 입력하셨습니다. 낮, 밤, 오후 세가지 중 선택하여 입력해 주세요.");
		}

	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤에는 숙면");
		// 코드작성할것
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
