<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Home page" %>
</h1>
<br/>
<form action="servlet1">
    Name:<input type="text" name="username"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>