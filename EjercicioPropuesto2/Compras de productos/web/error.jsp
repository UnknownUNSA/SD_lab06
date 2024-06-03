<%-- 
    Document   : error
    Created on : 1 jun. 2024, 13:32:04
    Author     : in4nd0
--%>

<%@ page isErrorPage="true" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
</head>
<body>
    <h1>Ocurrió un error</h1>
    <p>Lo sentimos, pero algo salió mal. Por favor, intenta nuevamente más tarde.</p>
    <h3>Detalles del error:</h3>
    <pre>
        <%= exception.getMessage() %>
    </pre>
    <h3>Traza del error:</h3>
    <pre>
        <%
            if (exception != null) {
                exception.printStackTrace(new java.io.PrintWriter(out));
            }
        %>
    </pre>
</body>
</html>

