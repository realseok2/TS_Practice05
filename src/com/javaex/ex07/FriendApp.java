package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Friend[] friendArray = new Friend[3]; 
		System.out.println("당신의 친구 3명을 등록해 주세요.");
		
		for(int i = 0; i<friendArray.length; i++) {
			friendArray[i]= new Friend();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			friendArray[i].setName(name);
			System.out.print("핸드폰 : ");
			String phone = sc.nextLine();
			friendArray[i].setPhone(phone);
			System.out.print("학교 : ");
			String school = sc.nextLine();
			friendArray[i].setSchool(school);
			System.out.println("-------------------------------------");
		}
		
		for(int i = 0; i<friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
