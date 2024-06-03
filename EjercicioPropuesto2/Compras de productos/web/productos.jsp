<%-- 
    Document   : productos
    Created on : 1 jun. 2024, 13:18:59
    Author     : in4nd0
--%>

<%@page import="comprar.Productos.ComprarProductos"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Detalle</title>
</head>
<body>
<%
    int lib, cuad, lap, col, moch, plu, carp, pap;
    ComprarProductos cp = new ComprarProductos();
    try {
        lib = Integer.parseInt(request.getParameter("param1"));
        cuad = Integer.parseInt(request.getParameter("param2"));
        lap = Integer.parseInt(request.getParameter("param3"));
        col = Integer.parseInt(request.getParameter("param4"));
        moch = Integer.parseInt(request.getParameter("param5"));
        plu = Integer.parseInt(request.getParameter("param6"));
        carp = Integer.parseInt(request.getParameter("param7"));
        pap = Integer.parseInt(request.getParameter("param8"));
    } catch (NumberFormatException nf) {
        throw new Exception("Ingreso de valores invalido, " + "ingrese solo numeros");
    } catch (NullPointerException np) {
        throw new Exception("Ingreso de valores incompletos, " + "llene todas las casillas de entrada");
    }

    if (lib<0||cuad<0||lap<0||col<0||moch<0||plu<0||carp<0||pap<0){
        throw new Exception("Ingreso de cifras invalido, " + "ingrese valores positivos");
    }

    String msg = cp.ComprarProductos(lib, cuad, lap, col, moch, plu, carp, pap);
%>
    <h1>Detalle de compra</h1>
    <pre><%=msg%></pre>
</body>
</html>

