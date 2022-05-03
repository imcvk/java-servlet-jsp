<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 03-05-2022
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>Operation</title>
</head>
<body>
<%
    int a = Integer.parseInt(request.getParameter("firstNum"));
    int b = Integer.parseInt(request.getParameter("secondNum"));
    int divide = a / b;
    out.println("<h1>Division is : "+divide+"</h1>");
%>
</body>
</html>
