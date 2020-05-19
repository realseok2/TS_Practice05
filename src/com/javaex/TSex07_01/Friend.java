package com.javaex.TSex07_01;

public class Friend {

	private String name;
	private String hp;
	private String school;

	// ---------------------------------------------------------- getter/setter 작성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// ---------------------------------------------------------- showInfo() 작성

	public void showInfo() {
		System.out.println("이름 : " + this.name + "\t  핸드폰 : " + this.hp + "\t  학교 : " + this.school);
	}

}