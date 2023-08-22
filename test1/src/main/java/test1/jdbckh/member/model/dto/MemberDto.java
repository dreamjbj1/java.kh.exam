package test1.jdbckh.member.model.dto;

import java.sql.Date;

public class MemberDto{
	
// vo -> 자료저장
//	CUSTNO   NOT NULL NUMBER(6)    
//	CUSTNAME          VARCHAR2(20) 
//	PHONE             VARCHAR2(13) 
//	ADDRESS           VARCHAR2(60) 
//	JOINDATE          DATE         
//	GRADE             CHAR(1)      
//	CITY              CHAR(2)
	
	private int CustNo;
	private String CustName;
	private String Phone;
	private String Address;
	private String JoinDate;
	private String Grade;
	private String City;
	
	public MemberDto() {
	}

	public MemberDto(int custNo, String custName, String phone, String address, String joinDate, String grade,
			String city) {
		this.CustNo = custNo;
		this.CustName = custName;
		this.Phone = phone;
		this.Address = address;
		this.JoinDate = joinDate;
		this.Grade = grade;
		this.City = city;
	}

	@Override
	public String toString() {
		return "MemberDto [CustNo=" + CustNo + ", CustName=" + CustName + ", Phone=" + Phone + ", Address=" + Address
				+ ", JoinDate=" + JoinDate + ", Grade=" + Grade + ", City=" + City + "]";
	}

	public int getCustNo() {
		return CustNo;
	}

	public void setCustNo(int custNo) {
		CustNo = custNo;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	
	
	
}
	