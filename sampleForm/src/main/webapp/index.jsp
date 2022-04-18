<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration form</title>
    <style>
        .container{
            width: 40%;
            border:1px solid black;
            margin: auto;
            padding: 20px;
            font-size: 20px;
        }
        #myForm table tr td input{
            font-size: 20px;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Registration form</h1>
    <form action="registerServlet" method="post" id="myForm">
        <table>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" id="username"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" id="password"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" name="gender" id="Male" value="Male">Male
                    <input type="radio" name="gender" id="Female" value="Female">Female
                </td>
            </tr>
            <tr>
                <td>Select your course:</td>
                <td>
                    <select name="courses">
                        <option value="Java">Java</option>
                        <option value="Python">Python</option>
                        <option value="C#">C#</option>
                        <option value="Android">Android</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="checkbox" value="checked" name="termsAndConditions" id="termsAndConditions" required>Agree Terms and Conditions</td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit" name="submitForm" id="submitForm">Submit</button>
                    <button type="reset" name="resetForm" id="resetForm">Reset</button>
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>