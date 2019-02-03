package dao;

import model.Employee;

public interface EmployeeDao {
   //boolean createEmployee();
   int	addEmployee(Employee employee);
   boolean deleteEmployee(int Employee_ID);
   //boolean updateEmployee();
   //Employee employeeFindByID(int a);
  
}
