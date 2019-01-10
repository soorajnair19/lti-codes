package com.hibernate.association;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int employeeId;
	
	private String firstName;
	
	private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Employee_Account", joinColumns
	= {@JoinColumn(name="employeeid"), inverseJoinColumns = { @JoinColumn(name="AccountId", 
		referencedColumnName="accountId"))}
	}
			)            
	private List <EmployeeEntity> accountlist;

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountlist=" + accountlist + "]";
	}

	public List<EmployeeEntity> getAccountlist() {
		return accountlist;
	}

	public void setAccountlist(List<EmployeeEntity> accountlist) {
		this.accountlist = accountlist;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public EmployeeEntity(int employeeId, String firstName, String lastName, AccountEntity account) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}*/
	
	public EmployeeEntity(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public AccountEntity getAccount() {
		return account;
	}


	
	
	
	
	
	
	
	
	
}
