package com.sab.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteTodoServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TodoService todoservice = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		todoservice.deleteTodo(new Todo(newTodo,category));
		response.sendRedirect("/ListTodo.do");

	}

}
