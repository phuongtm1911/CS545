<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<div id="global">
    <c:if test="${errors != null}">
        <p id="errors">
            <c:forEach var="error" items="${errors}">
                ${error}
            </c:forEach>
        </p>
    </c:if>

    <form action="calc2" method="post">
        <input type = "text" name = "add1" size = "2"  value = "${form.add1}" />+
        <input type = "text" name = "add2" value = "${form.add2}" size = "2"/>=
        <input type = "text" name = "sum" value = ""  size = "2" readonly/><br/>
        <input type = "text" name = "mult1" value = "${form.mult1}" size = "2"/>*
        <input type = "text" name = "mult2" value = "${form.mult2}"  size = "2"/>=
        <input type = "text" name = "product" value = ""   size = "2" readonly/><br/>
        <input type = "submit" value = "Submit"/>
    </form>
</div>
</body>
</html>