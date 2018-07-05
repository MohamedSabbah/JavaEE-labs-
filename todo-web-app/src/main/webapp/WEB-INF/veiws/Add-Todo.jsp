<%@ include file="../common/Header.jspf"%>
<%@ include file="../common/Navigation.jspf"%>
<div class="container">
	<h4>Your New Action Item:</h4>

	<h4>
		<font color="red">${errorMessage}</font>
	</h4>
	<form class="col-sm-6" action="/AddTodo.do" method="post">
		<fieldset>
			<label>Description </label> <input class="form-control" name="todo"
				type="text" /><br />
		</fieldset>
		<fieldset>
			<label>Category</label> <input class=" form-control" name="Category"
				type="text" /> <br />
		</fieldset>

		<input name="add" type="submit" class="btn btn-success" value="Submit" />
	</form>
</div>

<%@ include file="../common/Footer.jspf"%>