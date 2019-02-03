package javamaven.naz;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import dbutil.DBConnection;
import dbutil.DBEmployeeOperation;
import daoimplementatin.EmployeeDAOImp;
import model.Employee;

public class DataBaseTest {

	EmployeeDAOImp emp = new EmployeeDAOImp();

	Connection connection = DBConnection.getConnection();

	@Test
	public void Connectiontest() throws SQLException {

		String str = "DEV_TEST";
		assertEquals(str, connection.getCatalog());
	}

	@Test
	public void addEmployeeTest() {
		
		EmployeeDAOImp imp=new EmployeeDAOImp();
		
		Employee e1 = new Employee(1001, "Sworna", 5000, "Bangladesh", "123bd");
		
		//Employee e2 = new Employee(1022, "ffSworna", 150000, "npl", "45123bd");
		
		assertTrue(imp.addEmployee(e1)>0);
	}

	@Test
	public void deleteEmployeeTest() {
		assertTrue(emp.deleteEmployee(1001));
	}

	@Test
	public void findMaxSalTest() {
		int x = DBEmployeeOperation.FindMaxSal();
		assertEquals(10000000, x);
	}

	@Test
	public void findMinSalTest() {
		int x = DBEmployeeOperation.FindMinSal();
		assertEquals(10, x); // Giving 10 by checking, this is the minimum value in database
	}

	@Test
	public void findAvgSalTest() {
		int x = DBEmployeeOperation.FindAvgSal();
		assertEquals(627768, x); // Giving 627768 by checking, this is the average salary value in database
	}

	@Test
	public void findSecondMaxSalTest() {
		int x = DBEmployeeOperation.FindSecondMaxSal();
		assertEquals(1000000, x); // Giving 1000000 by checking, this is the second maximum value in database
	}

}
