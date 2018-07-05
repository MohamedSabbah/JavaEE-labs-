package calcAssignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcController
 */
@WebServlet("/CalcController")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// this is from the user input using parameter
    	String num1Str = request.getParameter("num1");
    	String num2Str = request.getParameter("num2");
    	String sum = request.getParameter("sum");
    	String sub = request.getParameter("sub");
    	String multi = request.getParameter("multi");
    	String divide = request.getParameter("divide");
    	String mud = request.getParameter("mud");
    	String pow = request.getParameter("pow");
    	double result;
    	try {
			double num1 = Double.parseDouble(num1Str);
			double num2 = Double.parseDouble(num2Str);
			CalcModel cal = new CalcModel(num1,num2);
			 if(sum != null)  result = cal.sum();
			 else if (sub != null) result = cal.sub();
			 else if (multi != null) result = cal.multi();
			 else if (divide != null) result = cal.divide();
			 else if (mud != null) result = cal.remainder(); 
			 else   result = cal.power();
			 
			
			
			// this is to result output  using attribute
			RequestDispatcher desp = request.getRequestDispatcher("CalcAssignment/Calc.jsp");
			request.setAttribute("resultAttr", result);
			desp.forward(request, response);
		} catch (NumberFormatException e) {
			RequestDispatcher desp1 = request.getRequestDispatcher("CalcAssignment/erro.jsp");
			request.setAttribute("msgAttr", e.getMessage());
			desp1.forward(request, response);
			
		}
    	
    	
    	
    	
    }
	

}
