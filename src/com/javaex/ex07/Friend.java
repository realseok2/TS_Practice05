package com.javaex.ex07;

public class Friend {

	private String name;
	private String phone;
	private String school;

//---------------------------------------------------------- 생성자


//---------------------------------------------------------- setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
//---------------------------------------------------------- 

	public void showInfo() {
		System.out.println("이름 : " + this.name + "\n핸드폰 : " + this.phone + "\n학교 : " + this.school);
	}

}
