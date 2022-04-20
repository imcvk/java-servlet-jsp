<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session tracking test</title>
    <style>
        .container {
            width: 40%;
            border: 1px solid black;
            margin: auto;
            padding: 20px;
            font-size: 20px;
        }

        #myForm table tr td input {
            font-size: 20px;
        }
    </style>
</head>
<body>
<h1><%= "Session tracking test" %>
</h1>
<br/>
<div class="container">
    <form action="servlet1">
        <input type="text" name="name" placeholder="Enter name here">
        <input type="submit" value="Go to Servlet1"/>
    </form>
</div>
</body>
</html>