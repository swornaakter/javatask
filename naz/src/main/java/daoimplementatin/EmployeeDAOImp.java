package daoimplementatin;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.EmployeeDao;
import javamaven.naz.DBConnection;
import model.Employee;

public class EmployeeDAOImp implements EmployeeDao {

	@Override
	public int addEmployee(Employee e) {
		Connection connection = DBConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO T_Employee_sss VALUES (?,?, ?, ?,?)");
			ps.setInt(1, e.getEmployee_ID());
			ps.setString(2, e.getEmployee_Name());
			ps.setInt(3, e.getEmployee_Salary());
			ps.setString(4, e.getEmployee_Country());
			ps.setString(5, e.getEmployee_ZipCode());

			int i = ps.executeUpdate();
			// if (i == 1) {
			return i;
			// }
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;
	}

	@Override

	public boolean deleteEmployee(int Employee_ID) {

		Connection connection = DBConnection.getConnection();
		try {
			Statement stmt = (Statement) connection.createStatement();
			int i = ((java.sql.Statement) stmt)
					.executeUpdate("DELETE FROM dbo.T_Employee_sss WHERE Employee_ID=" + Employee_ID);
			if (i == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;

	}

}