package com.sab.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/AddTodo.do")
public class AddTodoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TodoService todoservice = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/veiws/Add-Todo.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		if ("".equals(newTodo)) {
			request.setAttribute("errorMessage", "Enter a valid Todo");
			request.getRequestDispatcher("/WEB-INF/veiws/Add-Todo.jsp").forward(request, response);
		} else {
			todoservice.addTodo(new Todo(newTodo,category));
			
			request.setAttribute("todos", todoservice.retrieveTodo());
			request.getRequestDispatcher("/WEB-INF/veiws/List-todo.jsp").forward(request, response);
		}
		
		
	

	}

}
