<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />
<form:form modelAttribute="student" action="registration" method="post">
	<p>
		<form:errors path="*" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="id">Student Id: </label>
		<form:input path="id" id="id"/>
		<form:errors path="id" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="firstName">Student FirstName: </label>
		<form:input path="firstName" id="firstName"/>
		<form:errors path="firstName" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="lastName">Student LastName: </label>
		<form:input path="lastName" id="lastName"/>
		<form:errors path="lastName" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="email">Student Email: </label>
		<form:input path="email" id="email"/>
		<form:errors path="email" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="gender">Student Gender: </label>
		<form:select path="gender" id="gender">
			<form:option value="">Select gender</form:option>
			<form:option value="Male">Male</form:option>
			<form:option value="Female">Female</form:option>
		</form:select>
		<form:errors path="gender" cssStyle="color:red;"/>
	</p>
	<p>
		<label for="birthday">Student Birthday: </label>
		<form:input path="birthday" id="birthday"/>
		<form:errors path="birthday" cssStyle="color:red;"/>
	</p>
	    <p>
	        <label for="area">Student Phone: </label>
	        <form:input path="phone.area" id="area" size="3"/>-
	        <form:input path="phone.prefix" id="prefix" size="3"/>-
	        <form:input path="phone.number" id="number" size="4"/><br/>
			<form:errors path="phone.area" cssStyle="color:red;"/><br/>
			<form:errors path="phone.prefix" cssStyle="color:red;"/><br/>
	        <form:errors path="phone.number" cssStyle="color:red;"/>
	    </p>
	<p>
		<input id="submit" type="submit" value="Submit">
	</p>
</form:form>

</body>
</html>