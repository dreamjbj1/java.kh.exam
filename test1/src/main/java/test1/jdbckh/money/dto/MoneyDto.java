package test1.jdbckh.money.dto;

import java.sql.Date;

public class MoneyDto {
	
//	CUSTNO   NOT NULL NUMBER(6)    
//	CUSTNAME          VARCHAR2(20) 
//	GRADE             CHAR(1)      
//	TOTAL             NUMBER  
	
	private int CustNo;
	private String CustName;
	private String Grade;
	private int Total;
	
	public MoneyDto() {
	}

	public MoneyDto(int custNo, String custName, String grade, int total) {
		this.CustNo = custNo;
		this.CustName = custName;
		this.Grade = grade;
		this.Total = total;
	}

	@Override
	public String toString() {
		return "MoneyDto [CustNo=" + CustNo + ", CustName=" + CustName + ", Grade=" + Grade + ", Total=" + Total + "]";
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

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	
	

}