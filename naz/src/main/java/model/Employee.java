package model;



public class Employee {
	private int Employee_ID, Employee_Salary;
	private String Employee_Name, Employee_Country,Employee_ZipCode;
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public int getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(int employee_Salary) {
		Employee_Salary = employee_Salary;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getEmployee_Country() {
		return Employee_Country;
	}
	public void setEmployee_Country(String employee_Country) {
		Employee_Country = employee_Country;
	}
	public String getEmployee_ZipCode() {
		return Employee_ZipCode;
	}
	public void setEmployee_ZipCode(String employee_ZipCode) {
		Employee_ZipCode = employee_ZipCode;
	}
	public Employee(int employee_ID,  String employee_Name,int employee_Salary, String employee_Country,
			String employee_ZipCode) {
		super();
		Employee_ID = employee_ID;
		Employee_Salary = employee_Salary;
		Employee_Name = employee_Name;
		Employee_Country = employee_Country;
		Employee_ZipCode = employee_ZipCode;
	}
	
	
	

}
