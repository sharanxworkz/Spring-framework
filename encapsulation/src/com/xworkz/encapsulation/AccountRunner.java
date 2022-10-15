package com.xworkz.encapsulation;

public class AccountRunner {
	public static void main(String[] args) {
		AccountSbi accountSbi = new AccountSbi();
		accountSbi.setId(10);
		int a=accountSbi.getId();
	
		System.out.println(a);
System.out.println(accountSbi.getId());
	}

}
