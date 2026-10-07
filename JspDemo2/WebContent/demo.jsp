<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Demo</title>
</head>

<body>

    <h1>JSP Technology Demo</h1>

    <!-- JSP Declaration -->
    <%! 
        int square(int n) {
            return n * n;
        }
    %>

    <!-- JSP Scriptlet -->
    <%
        String name = "Rahul";
        int number = 10;
    %>

    <!-- JSP Expression -->
    <p>Name: <%= name %></p>

    <p>Number: <%= number %></p>

    <p>Square of <%= number %>:
       <%= square(number) %>
    </p>

    <p>Welcome to JSP!</p>

</body>
</html>
