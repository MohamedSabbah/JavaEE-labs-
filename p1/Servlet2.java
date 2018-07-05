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
 * Servlet implementation class Servlet2
 */
@WebServlet({ "/Servlet2", "/S2" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init................");
	}

	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		/*int code = 100;
		out.println("<html>");
		out.println("<head><title>");
		out.println("My page");
		out.println("</title></head>");
		out.println("<body>");
		out.println("hello, ahmed!</br>");
		out.println("your code is:" + code);
		out.println("</body>");
		out.println("</html>");
		*/
		out.println("<html>");
		out.println("<head><title>");
		out.println("My page");
		out.println("</title></head>");
		out.println("<body>");
		out.println("hello, "+ name+"</br>");
		out.println("your pass is:" + password);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy...................");
	}


}
