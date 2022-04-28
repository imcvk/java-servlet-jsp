<%@ page import="java.util.function.DoubleToIntFunction" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "JSP Tags Demo" %>
</h1>
<br/>
<%--Declarative tag in JSP --%>
<%!
    String name = "India";
    int a = 123;
    int b = 324234;
    String message = "Test for Expression tag in JSP";

    public int sum() {
        return a + b;
    }

    public String reverseString() {
        return new StringBuffer(name).reverse().toString();
    }

%>
<%--Scriptlet tag in JSP--%>
<%
    out.print("This is using scriplet tag ");
    out.println("<br>");
    out.println("Output for sum() in Declarative tag is=" + sum());
    out.println("<br>");
    out.println("Output for String reverse method in declarative tag method is:" + reverseString());
%>
<%--Expression tag in JSP--%>
<br>
<h1>Message fetched using expression tag in JSP: <%=message%>
</h1>
</body>
</html>