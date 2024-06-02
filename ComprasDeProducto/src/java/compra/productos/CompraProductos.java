/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package compra.productos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CompraProductos", urlPatterns = {"/CompraProductos"})
public class CompraProductos extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreProducto = request.getParameter("producto");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));

        if (cantidad < 0) {
            response.getWriter().write("Lo siento, ingrese una cantidad positiva.");
        } else {
            double total = precio * cantidad;
            request.setAttribute("nombreProducto", nombreProducto);
            request.setAttribute("precio", precio);
            request.setAttribute("cantidad", cantidad);
            request.setAttribute("total", total);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        }
    }
}
