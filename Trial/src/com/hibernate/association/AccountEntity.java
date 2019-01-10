package com.hibernate.association;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity implements Serializable {

	@Id
	@Column(name="id" ,nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)

	private int accountId;
	
	@Column(nullable=false,length=40)
	private String accountNumber;

	public int getAccountId() {
		return accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountEntity [accountId=" + accountId + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	
}
