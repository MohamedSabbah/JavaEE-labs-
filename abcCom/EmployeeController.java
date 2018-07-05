package abcCom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection conn = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		try {
			conn = Myconnection.getConnection();
			System.out.println("Connected.................");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int idd = Integer.parseInt(idStr);
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String salaryStr = request.getParameter("salary");
		double salary = Double.parseDouble(salaryStr);
		EmployeeModel emp = new EmployeeModel(idd, fName, lName, salary, conn);
		try {
			
			boolean b = emp.insertEmp();
			if (b == true) {
				RequestDispatcher rs = request.getRequestDispatcher("ABCCompany/ABCResult.jsp");
				request.setAttribute("msg", "Sucessfully Saved....");
				rs.forward(request, response);
			}else {	
					RequestDispatcher rs = request.getRequestDispatcher("ABCCompany/Error.jsp");
					request.setAttribute("msg", "Flied to Save hehehehehehe :) ");
					rs.forward(request, response);
			 }
		} catch (SQLException e) {
			RequestDispatcher rs = request.getRequestDispatcher("ABCCompany/Error.jsp");
			request.setAttribute("msg", e.getMessage());
			rs.forward(request, response);
			
		}
		
		
		
		
	}
	@Override
	public void destroy() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
