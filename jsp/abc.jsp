<html>
<head>
    <title>First JSP Program</title>
</head>
<body>
    <h2> Hello World</h2>
    <%= new java.util.Date() %>
    <form method="post" action="def.jsp">
        Name: <input type="text" name="name"/>
        Address: <input type="text" name="address"/>
        Course: <input type="text" name="course"/>
        <input type="submit" value="submit">
    </form>       
</body>
</html>
