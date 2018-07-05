package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import conn.MyCustomConn;



public class Employee {
	private  String fName;
	private String sName;
	private int id;
	private double salary;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rset;
	
	
	private String msg;
	
	private List<Employee> empList = new ArrayList<>();
	

	public Employee() {
		super();
		this.setConn();
		
	}
	
	
	public Employee(int id,String fName, String sName , double salary) {
		super();
		this.fName = fName;
		this.sName = sName;
		this.id = id;
		this.salary = salary;
	}
	
	


	public List<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Connection getConn() {
		return conn;
	}


	public void setConn() {
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = req.getSession();
		MyCustomConn custom = (MyCustomConn)session.getAttribute("customAttr");
		
		this.conn = custom.getConn();
	}


	public PreparedStatement getPstmt() {
		return pstmt;
	}


	public void setPstmt(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}


	public ResultSet getRset() {
		return rset;
	}


	public void setRset(ResultSet rset) {
		this.rset = rset;
	}
	
	public void save() {
		try {
			
		 pstmt =	conn.prepareStatement("insert into employee values (?,?,?,?)");
			pstmt.setInt(1, getId());
			pstmt.setString(2, getfName());
			pstmt.setString(3, getsName());
			pstmt.setDouble(4, getSalary());
			pstmt.executeUpdate();
			conn.commit();
			this.setMsg("Successfully Saved....");
		} catch (SQLException e) {
			
			this.setMsg("Faild.......");
		}
		
	}
	
	public void getInfo() {
		
		try {
			pstmt =	conn.prepareStatement("select * from employee");
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Employee emp2 = new Employee(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getDouble(4));
				empList.add(emp2);
			 
				
			}
			
		} catch (SQLException e) {
			this.setMsg("Faild.......");
		}
		
	}
	
	

}
