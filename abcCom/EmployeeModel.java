package abcCom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EmployeeModel {
	private int id ;
	private String fName;
	private String lName;
	private double Salary;
	private Connection conn;
	
	public EmployeeModel() {
		super();
	}


	public EmployeeModel(int id, String fName, String lName, double salary) {
		super();
		setId(id);
		setfName(fName);
		setlName(lName);
		setSalary(salary);
	}
	
	public EmployeeModel(int id, String fName, String lName, double salary, Connection conn) {
		super();
		setId(id);
		setfName(fName);
		setlName(lName);
		setSalary(salary);
		setConn(conn);
	}
	
	
	
	


	public Connection getConn() {
		return conn;
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}

    
	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public boolean insertEmp() throws SQLException {
		boolean done = false;
		PreparedStatement pstmt = conn.prepareStatement("insert into  employee value (?, ?, ?, ?)");
		pstmt.setInt(1, getId());
		pstmt.setString(2, getfName());
		pstmt.setString(3, getlName());
		pstmt.setDouble(4, getSalary());
		pstmt.executeUpdate();
		conn.commit();
		done = true;
		return done ;
		
	}
	
	
	

}
