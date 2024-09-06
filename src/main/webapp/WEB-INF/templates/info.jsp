<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Info</title>
</head>
<body>
<h2>Customer Information</h2>
<form action="#" method="post">
    <input type="hidden" name="id" value="${customer.id}" />
    Name: <input type="text" name="name" value="${customer.name}" /><br/>
    Email: <input type="text" name="email" value="${customer.email}" /><br/>
    Address: <input type="text" name="address" value="${customer.address}" /><br/>
    <input type="submit" value="Update"/>
</form>
<a href="/customers">Back to list</a>
</body>
</html>
