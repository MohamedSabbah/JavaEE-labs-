package listner;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import conn.MyCustomConn;
import conn.Myconnection;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener {
	private Connection conn;
    /**
     * Default constructor. 
     */
    public SessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        HttpSession session = se.getSession();
        try {
			conn = Myconnection.getConnection();
			System.out.println("Connected....");
			MyCustomConn custom = new MyCustomConn();
			custom.setConn(conn);
			session.setAttribute("customAttr", custom);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
