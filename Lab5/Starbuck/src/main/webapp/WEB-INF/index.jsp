<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>

<p />
<div style="${disabledAdvice}">
    <p>Hello, ${user.name}</p>
    <form action = "logout.do" method="post">
        <p><input type="submit" value = "Logout"/></p>
    </form>
    <form action="advice.do" method="get">
        <input type = "submit" value = "Get Advice"/>
    </form>
</div>

<p />
<div style="${disabledLogin}">
Login:
<form action = "login.do" method = "post">
    Name: <input type = "text" name = "name" size = "9" /><br/>
    Password: <input type = "password" name = "password" size = "9" /><br/>
    <br/>
    <input type="submit" value = "Log In"/>
</form>
</div>
</body>
</html>