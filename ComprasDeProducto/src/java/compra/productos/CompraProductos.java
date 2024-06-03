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

    // Precio fijo por producto
    private static final double PRECIO_PAN = 1.5;
    private static final double PRECIO_QUESO = 5.0;
    private static final double PRECIO_NARANJAS = 0.75;
    private static final double PRECIO_PLATANOS = 0.5;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtiene la cantidad ingresada por el usuario para cada producto
        int cantidadPan = Integer.parseInt(request.getParameter("cantidadPan"));
        int cantidadQueso = Integer.parseInt(request.getParameter("cantidadQueso"));
        int cantidadNaranjas = Integer.parseInt(request.getParameter("cantidadNaranjas"));
        int cantidadPlatanos = Integer.parseInt(request.getParameter("cantidadPlatanos"));

        // Verifica si alguna cantidad es negativa
        if (cantidadPan < 0 || cantidadQueso < 0 || cantidadNaranjas < 0 || cantidadPlatanos < 0) {
            request.setAttribute("errorMessage", "Lo siento, ingrese una cantidad positiva.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        // Calcula el total para cada producto
        double totalPan = cantidadPan * PRECIO_PAN;
        double totalQueso = cantidadQueso * PRECIO_QUESO;
        double totalNaranjas = cantidadNaranjas * PRECIO_NARANJAS;
        double totalPlatanos = cantidadPlatanos * PRECIO_PLATANOS;

        // Calcula el total general
        double totalGeneral = totalPan + totalQueso + totalNaranjas + totalPlatanos;

        // Establece los atributos para enviar a la página de resultado.jsp
        request.setAttribute("cantidadPan", cantidadPan);
        request.setAttribute("cantidadQueso", cantidadQueso);
        request.setAttribute("cantidadNaranjas", cantidadNaranjas);
        request.setAttribute("cantidadPlatanos", cantidadPlatanos);
        request.setAttribute("totalPan", totalPan);
        request.setAttribute("totalQueso", totalQueso);
        request.setAttribute("totalNaranjas", totalNaranjas);
        request.setAttribute("totalPlatanos", totalPlatanos);
        request.setAttribute("totalGeneral", totalGeneral);

        // Redirige a la página de resultado.jsp
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
