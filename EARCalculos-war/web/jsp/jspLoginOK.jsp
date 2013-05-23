<%-- 
    Document   : jspLoginOK
    Created on : 17-may-2013, 19:56:54
    Author     : jalmenarez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola usuario</h1>
        <%
            String usuario = (String)request.getAttribute("_username");
            String password = (String)request.getAttribute("_password");
        %>
        <h2>El usuario y la password son: <%=usuario%>, <%=password%></h2>
    </body>
</html>
