<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>

    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Category: <spring:eval expression="product.category"/><br/>
    Description: ${product.description}<br/>
    Price: $${product.price}

    <form action="listproducts" method="get">
           <input id="submit" type="submit"  
                value="List products">
	</form>
    
</div>
</body>
</html>