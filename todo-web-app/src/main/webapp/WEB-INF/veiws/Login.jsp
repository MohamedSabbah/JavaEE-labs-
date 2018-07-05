<%@ include file="../common/Header.jspf"%>
<%@ include file="../common/Navigation.jspf"%>

<div class="container  ">

	<form class="col-sm-4" action="/Login.do" method="post">
		<h4>
			<FONT color="red">${errorMassege}</FONT>
		</h4>

		<fieldset>
			<label>Enter Your Name </label> <input type="text" name="name"
				class="form-control" placeholder="Enter Your Name" /><br>
		</fieldset>

		<fieldset>
			<label>Password</label> <input class=" form-control" type="password"
				name="password" placeholder="Enter Password" /><br>
		</fieldset>

		<input type="submit" value="Login" class="btn btn-success btn-block" />


	</form>


</div>


<%@ include file="../common/Footer.jspf"%>