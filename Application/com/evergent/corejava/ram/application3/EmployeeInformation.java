package com.evergent.corejava.ram.application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{

	int empno;
	double sal;
	String address;

	public void employeeInfo(int eno, float sal) 
	{
		this.empno=eno;
		this.sal=sal;
		
	}

	public void employeeAddress(String add) {
		this.address=add;
		
		
	}

	public void employeeDetails() {
		System.out.println("Employee no:"+empno);
		System.out.println("Employee sal:"+sal);
		System.out.println("Employee Address:"+address);		
	}

	public void accountDetails() {
		System.out.println("MuAccount details is: 123456");
			
	}
	public void show() {
		System.out.println("This is show local method");
	}
	public static void main(String[] args) throws Exception {
		EmployeeInformation emp = new EmployeeInformation();
		BankRBI rbi=new BankRBI();
		emp.accountDetails();
		emp.bankDetails();
		emp.employeeInfo(100,5000);
		emp.employeeAddress("Bangalore");
		emp.employeeDetails();		
		
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
		emp.show();
		
		
	}

}
