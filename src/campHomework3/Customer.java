package campHomework3;

import java.util.Date;

import campHomework3.members.Members;

public class Customer extends Members{
	private int customerId;
	private String tcNo;
	private Date birthYear;
	
	public Customer() {
		
	}
	
	public Customer(int customerId, String tcNo, Date birthYear) {
		super();
		this.customerId = customerId;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public Date getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}
	
	
}
