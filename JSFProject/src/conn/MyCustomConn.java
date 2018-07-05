package conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class MyCustomConn
 *
 */
@WebListener
public class MyCustomConn implements HttpSessionBindingListener {
	private Connection conn;
    public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	/**
     * Default constructor. 
     */
    public MyCustomConn() {
       
       
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event)  { 
         System.out.println("add");
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event)  { 
         System.out.println("Remove");
         try {
			conn.close();
			System.out.println("disConnected.....");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
	
}
