<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
	<section>
		<div class="pull-right" style="padding-right:50px">
			<a href="?language=en">English</a>|<a href="?language=nl">Dutch</a>
		</div>
	</section>
	<div id="global">
		<form:form modelAttribute="employee" action="employee_save" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id">
						<spring:message code="EmpoyeeForm.form.id.label" /> </label>
					<form:input path="id" id="id" />
					<div style="text-align: center;">
						<form:errors path="id" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="firstName">
						<spring:message code="EmpoyeeForm.form.firstName.label" /></label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName">
						<spring:message code="EmpoyeeForm.form.lastName.label" /> </label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="birthDate">
						<spring:message code="EmpoyeeForm.form.birthDate.label" /> </label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel">
						<spring:message code="EmpoyeeForm.form.salaryLevel.label" /> </label>
					<form:input path="salaryLevel" id="salaryLevel" />
					<div style="text-align: center;">
						<form:errors path="salaryLevel" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="employeeImage">
						<spring:message code="EmpoyeeForm.form.employeeImage.label" /> </label>
						<form:input path="employeeImage" id="employeeImage" type="file" />
				<div style="text-align: center;">
					<form:errors path="employeeImage" cssStyle="color : red;" />
				</div>
				</p>
				<h4>Address:</h4>
				<p>
					<label for="street">
						<spring:message code="EmpoyeeForm.form.street.label" /> </label>
					<form:input path="address.street" id="street" />
					<div style="text-align: center;">
						<form:errors path="address.street" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="state">
						<spring:message code="EmpoyeeForm.form.state.label" /> </label>
					<form:input path="address.state" id="state" />
					<div style="text-align: center;">
						<form:errors path="address.state" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="zipCode">
						<spring:message code="EmpoyeeForm.form.zip.label" /> </label>
					<form:input path="address.zipCode" id="zipCode" />
					<div style="text-align: center;">
						<form:errors path="address.zipCode" cssStyle="color : red; " />
					</div>
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> 
					<input id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
