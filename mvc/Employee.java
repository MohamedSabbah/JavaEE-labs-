package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Employee {
	 
	 private int id ;
	 private String firstName;
	 private String lastName;
	 private double salary;
	 private Connection conn;
	 private PreparedStatement pstmt;
	 private ResultSet rset;
	 
	public Employee() {
		super();
	}
	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	void  getiInfo() throws SQLException{
		pstmt = conn.prepareStatement("select * from employee where id = ?");
		pstmt.setInt(1, getId());
		rset = pstmt.executeQuery();
		while (rset.next()) {
			setId(rset.getInt("id"));
			
			
		}
		
		 
	 }
}
