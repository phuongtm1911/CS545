<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Starbuck's</title>
</head>
<body>
<form action="../action/login" method="get">
    Starbuck's ${roast} Roast Coffees: <br/>
    <table>
        <c:forEach var="i" begin="0" end="${advice.size()}">
            <c:choose>
                <c:when test="${i % 2 == 0}">
                    <tr style="background-color:cyan">
                </c:when>
                <c:when test="${i % 2 != 0}">
                    <tr style="background-color:yellow">
                </c:when>
            </c:choose>
            <td>${advice[i]}<td></tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>
</body>
</html>