<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <h1><%= "Hello World!" %>
    </h1>
    <br/>
    <a href="/login">Hello Servlet</a>
    <form action="/login" method="post">
        <label>UserName: </label><input type="text" name="userName">
        <label>Password: </label><input type="password" name="password">
        <input type="submit" value="OK">
    </form>
</body>
</html>