
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="calculator">
            <label>First: </label>
            <input type="text" name="first" value="${firstVar}">
            <br>
            <label>Last: </label>
            <input type="text" name="last" value="${lastVar}">
            <br><br>
            <input type="submit" value=" + ">
            <input type="submit" value=" - ">
            <input type="submit" value=" * ">
            <input type="submit" value=" % ">
        </form>
        
        <p>Result : ${startVar}</p>
        
        <a href="/WEB-INF/agecalculator.jsp">Age Calculator</a>
    </body>
</html>
