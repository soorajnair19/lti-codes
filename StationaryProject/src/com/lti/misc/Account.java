package com.lti.misc;

public class Account {
	private int accountID;
	private String accountType;
	private double balance;

	public Account(int accountID, String accountType, double balance) {
		super();
		this.accountID = accountID;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	public void applyCharges()
	{ //local class inside the method
		float charges = 0.0f;
		int numDays = 0;
		
		class Audit
		{	
			float charges = 0.00f;
					void calculateCharges(int daysoverdue)
			{
				if(daysoverdue>7 && daysoverdue<=10)
				{
					charges = 1000.00f;
				}
				else if(daysoverdue > 10)
				{
					charges = 2000.00f; 

				}
				System.out.println("before charges balance is"+balance);
				balance = balance - charges;
				System.out.println("charges amounted to"+charges);
					
		}
	}

		Audit a1 = new Audit();
		a1.calculateCharges(100);
		System.out.println(balance);
	}
	
	public void withdraw(double amt) throws LessFundsException
	{
		if(amt>this.balance)
			throw new LessFundsException("not enough balance");
		else
			this.balance = this.balance - amt;
		
		
	}
	
	
	
	
		public static void main(String [] args)
		{
		Account a2= new Account(3432,"current",212121);	
		a2.applyCharges();

		}
		
		
		
}

