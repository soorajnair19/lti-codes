package com.lti.misc;

public class TesterAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account (12121,"savings",56000);
		try {
			acc1.withdraw(5000000);
			
		}
		catch(LessFundsException e)
		{
			System.out.println(e.getMessage());
		}
System.out.println(acc1.getBalance());
	}

}
