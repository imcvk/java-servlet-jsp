<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 24-04-2022
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="LoginServlet" method="post">
    Name:<input type="text" name="name"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit" value="login">
</form>
</body>
</html>
