<%-- 
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tyler's Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="POST" action="age">
            <label>Enter Your Age: </label>
            <input type="text" name="your_age" value="">
            <br><br>
            <p>${message}</p>
            <input type="submit" value=" Age Next Birthday ">
        </form>
        <a href="/WEB-INF/arithmeticcalculator.jsp">Arithmetic Calculator</a>
    </body>
</html>
