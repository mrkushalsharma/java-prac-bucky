<html>
<head>
    <title>JSP Program</title>
</head>
<body>
    <% 
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String course = request.getParameter("course");

        if(name != null) %>
            <h3> Name: <%= name%> </h3>
        <%
        if(address != null)
        %>
            <h3> address: <%= address%> </h3>        
        <%
        if(course != null) %>
            <h3> course: <%= course%> </h3>         
</body>
</html>
