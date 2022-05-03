<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 01-05-2022
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>

<%--example for page directive--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome jsp</title>
</head>
<body>
<%
    String username = request.getParameter("uname");
    String password = request.getParameter("password");
    out.println("<html><body><h1>" +
            "Username:" + username +"<br>"+
            "password:" + password +
            "</h1></body></html>");
%>
</body>
</html>
