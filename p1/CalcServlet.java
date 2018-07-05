package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet({ "/CalcServlet", "/Calculator" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("number1");
		String s2 = request.getParameter("number2");
		PrintWriter out = response.getWriter();
		try {
			double num1 = Double.parseDouble(s1);
			double num2 = Double.parseDouble(s2);
			double result = num1 + num2;
			out.println("<html>");
			out.println("<head><title>");
			out.println("My page");
			out.println("</title></head>");
			out.println("<body>");
			out.println(num1+ " + " + num2 +" = " + result+"</br>");
			out.println("</body>");
			out.println("</html>");
			
		} catch (NumberFormatException e) {
			
			System.out.println("Invalid Number......");
		}finally {
			try {
				out.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


}
