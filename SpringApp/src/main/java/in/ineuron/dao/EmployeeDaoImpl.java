package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String SQL_SELECT_QUERY = "select eid,ename,eage,eaddress from employee";
	@Autowired
	private DataSource dataSource;
	@Override
	public List<Employee> findAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> empList=null;
		System.out.println("data source ::"+dataSource.getClass().getName());
		try(Connection con=dataSource.getConnection();PreparedStatement pstmt=con.prepareStatement(SQL_SELECT_QUERY);ResultSet rs=pstmt.executeQuery())
		{
			empList=new ArrayList<Employee>();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setEage(rs.getInt(3));
				emp.setEaddress(rs.getString(4));
				empList.add(emp);
			}
		}
		return empList;
	}

}
