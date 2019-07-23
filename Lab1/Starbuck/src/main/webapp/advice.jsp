<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<html>
<head>
    <title>Starbuck's</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action="advice" method="post">
    <%
        Map< String, String > roastMap = new HashMap<String, String>();
        roastMap.put("dark", "Dark");
        roastMap.put("medium", "Medium");
        roastMap.put("light", "Light");
        request.setAttribute("roastMap", roastMap);
    %>
    <select name="roast" >
        <option value="-">--Choose Roast--</option>
        <c:forEach var="roast" items="${roastMap}">
            <option value="${roast.key}">${roast.value}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit" />
</form>

</body>
</html>