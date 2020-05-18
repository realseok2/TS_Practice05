package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

// ---------------------------------------------------------   setter, getter

	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

	// -----------------------------------------------------------------------------
	// 필요한 메소드 작성

	public void deposit(int money) {
		this.balance = this.balance + money;
	}

	public void withdraw(int money) {
		this.balance = this.balance - money;
	}

	public void showBalance() {
		System.out.println(this.balance);
	}

}