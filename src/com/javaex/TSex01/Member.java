package com.javaex.TSex01;

public class Member {

	private String id;
	private String name;
	private int point;

//--------------------------------------------------------------------- setter, getter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

//--------------------------------------------------------------------- showInfo()

	public void showInfo() {
		System.out.println("회원정보 : " + this.name + " [ " + this.id + " ] ,\t" + this.point + "point.");
	}

}
