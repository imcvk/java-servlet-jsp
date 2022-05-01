<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 26-04-2022
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Profile</title>
</head>
<body>
<div style="padding-left: 40%; padding-top: 10%">
    <h1>Employee Register Form</h1>
    <form action="EmployeeServlet" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="<% request.getParameter("firstName")%>"></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName"></td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>contact:</td>
                <td><input type="text" name="contact"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Sign in</button>
                </td>
                <td>
                    <button type="reset">Clear</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
