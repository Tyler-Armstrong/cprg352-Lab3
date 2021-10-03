
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first" value="${firstVar}">
            <br>
            <label>Last: </label>
            <input type="text" name="last" value="${lastVar}">
            <br><br>
            <input type="submit" name="add" value=" + ">
            <input type="submit" name="sub" value=" - ">
            <input type="submit" name="mult" value=" * ">
            <input type="submit" name="mod" value=" % ">
        </form>
        
        <p>Result : ${startVar}</p>
        
        <a href="http://localhost:8084/Lab03/age">Arithmetic Calculator</a>
    </body>
</html>
