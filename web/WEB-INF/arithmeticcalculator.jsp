<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="number" name="firstNum" value="${FirstNum}">
            <br>
            <label>Second:</label>
            <input type="number" name="secondNum" value="${SecondNum}">
            <br>
            <input type="submit" name="plus" value="+">
            <input type="submit" name="minus" value="-">
            <input type="submit" name="times" value="*">
            <input type="submit" name="modulo" value="%">
            <br>
        </form>
        <div>${message}</div>
        <a href="/Calculators/">Age Calculator</a>
    </body>
</html>
