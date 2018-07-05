<%@ include file="../common/Header.jspf"%>
<%@ include file="../common/Navigation.jspf"%>
<div class="container">
	<h1>Welcome ${name}</h1>
	
	<table class="table table-striped">
		<caption>Your Todos are</caption>

		<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Action</th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td>&nbsp;&nbsp; <a class="btn btn-danger"
						href="/deletetodo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="/AddTodo.do?todo=${todo.name}">AddNew Todo</a>

</div>

<%@ include file="../common/Footer.jspf"%>