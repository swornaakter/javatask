package dbutil;

import dbutil.DBConnection;
import daoimplementatin.EmployeeDAOImp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employee;

public class DBEmployeeOperation {

	public static boolean Create() {
		Connection connection = DBConnection.getConnection();
		try {
			System.out.println("Creating table in given database...");
			Statement stmt = connection.createStatement();

			String sql = "CREATE TABLE T_Employee_sss" + "(Employee_ID INTEGER not NULL, "
					+ " Employee_Name VARCHAR(255), " + " Employee_Salary INTEGER, "
					+ " Employee_Country VARCHAR(255), " + "Employee_ZipCode VARCHAR(255)"
					+ " PRIMARY KEY ( Employee_ID ))";

			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			// log.error("Connection error: " + e.getMessage());
		}
		return false;

	}

	/*
	 * public static void main(String args[]) throws SQLException {
	 * 
	 * Connection connection = DBConnection.getConnection();
	 * 
	 * 
	 * 
	 * System.out.println("connection Catalog===" + connection.getCatalog() + "\n");
	 * System.out.println("getClass===" + connection.getClass() + "\n");
	 * System.out.println("getMetaData===" + connection.getMetaData() + "\n");
	 * 
	 * Create();
	 * 
	 * EmployeeDAOImp emp = new EmployeeDAOImp();
	 * 
	 * Employee e1 = new Employee(1000, "Sworna", 50000, "Bangladesh", "123bd");
	 * Employee e2 = new Employee(1001, "Roshan", 60000, "Nepal", "123np"); Employee
	 * e3 = new Employee(1002, "Mukesh", 50000, "Vutan", "123vt");
	 * 
	 * emp.addEmployee(e1); emp.addEmployee(e2); emp.addEmployee(e3); //
	 * emp.updateUser(user1_change, 1); // emp.deleteUser(1); // // User us =
	 * uDAOi.userFindByID(1); //
	 * //System.out.println(us.getId()+" "+us.getName()+" "+us.getSalary()+" "+us.
	 * getPassword());
	 * 
	 * }
	 */

	public static int FindMaxSal() {
		Connection connection = DBConnection.getConnection();
		int max = 0, x;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.T_Employee_sss");
			while (rs.next()) {
				x = rs.getInt("Employee_Salary");
				if (x > max)
					max = x;
			}
			return max;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return max;

	}

	public static int FindMinSal() {
		Connection connection = DBConnection.getConnection();
		int min = 999999999, x;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.T_Employee_sss");
			while (rs.next()) {
				x = rs.getInt("Employee_Salary");
				if (x < min)
					min = x;
			}
			return min;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return min;

	}

	public static int FindAvgSal() {
		Connection connection = DBConnection.getConnection();
		int sum = 0, x = 0;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.T_Employee_Details");
			while (rs.next()) {
				sum += rs.getInt("Employee_Salary");
				x++;
			}
			return sum / x;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return sum / x;
	}

	public static int FindSecondMaxSal() {
		Connection connection = DBConnection.getConnection();

		int max = FindMaxSal();

		int second_max = 0, x;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.T_Employee_Details");
			while (rs.next()) {
				x = rs.getInt("Employee_Salary");
				if (x < max && x > second_max)
					second_max = x;
			}
			return second_max;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return second_max;

	}

}
