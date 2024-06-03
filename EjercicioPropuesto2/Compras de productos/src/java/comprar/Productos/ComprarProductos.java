/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package comprar.Productos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author in4nd0
 */
@WebService(serviceName = "ComprarProductos")
public class ComprarProductos {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprarProductos")
    public String ComprarProductos(@WebParam(name = "CantidadLibros") int CantidadLibros,
            @WebParam(name = "CantidadCuadernos") int CantidadCuadernos, @WebParam(name
                    = "CantidadLapiceros") int CantidadLapiceros, @WebParam(name = "CantidadColores") int CantidadColores, @WebParam(name = "CantidadMochilas") int CantidadMochilas,
            @WebParam(name = "CantidadPlumones") int CantidadPlumones, @WebParam(name
                    = "CantidadCarpetas") int CantidadCarpetas, @WebParam(name = "CantidadPapelotes") int CantidadPapelotes) {
//TODO write your implementation code here:
        String mensaje = "";
        double precioLibro = 10.0, precioCuaderno = 5.0, precioLapicero = 1.0, precioColor
                = 2.0, precioMochila = 20.0, precioPlumon = 3.0, precioCarpeta = 4.0, precioPapelote = 6.0;
        double totalLibro = 0, totalCuaderno = 0, totalLapicero = 0, totalColor = 0, totalMochila = 0, totalPlumon = 0, totalCarpeta = 0, totalPapelote = 0, totalCompra = 0;
        if (CantidadLibros <= 0 || CantidadCuadernos <= 0 || CantidadLapiceros <= 0
                || CantidadColores <= 0 || CantidadMochilas <= 0 || CantidadPlumones <= 0
                || CantidadCarpetas <= 0 || CantidadPapelotes <= 0)
            mensaje += "Lo siento, ingrese una cantidad correcta";
        else {
            mensaje += "\n";
            totalLibro += CantidadLibros * precioLibro;
            mensaje += "Libros: " + CantidadLibros + "Unidades ---> Precio c/u: " + precioLibro + "\n SubTotal: "+totalLibro;
mensaje += "\n";
            totalCuaderno += CantidadCuadernos * precioCuaderno;
            mensaje += "Cuadernos: " + CantidadCuadernos + "Unidades ---> Precio c/u: "
                    + precioCuaderno + " \n SubTotal: " + totalCuaderno;
            mensaje += "\n";
            totalLapicero += CantidadLapiceros * precioLapicero;
            mensaje += "Lapiceros: " + CantidadLapiceros + "Unidades ---> Precio c/u: "
                    + precioLapicero + " \n SubTotal: " + totalLapicero;
            mensaje += "\n";
            totalColor += CantidadColores * precioColor;
            mensaje += "Colores: " + CantidadColores + "Unidades ---> Precio c/u: " + precioColor
                    + " \n SubTotal: " + totalColor;
            mensaje += "\n";
            totalLibro += CantidadMochilas * precioMochila;
            mensaje += "Mochilas: " + CantidadMochilas + "Unidades ---> Precio c/u: "
                    + precioMochila + " \n SubTotal: " + totalMochila;
            mensaje += "\n";
            totalPlumon += CantidadPlumones * precioPlumon;
            mensaje += "Plumones: " + CantidadPlumones + "Unidades ---> Precio c/u: "
                    + precioPlumon + " \n SubTotal: " + totalPlumon;
            mensaje += "\n";
            totalCarpeta += CantidadCarpetas * precioCarpeta;
            mensaje += "Carpetas: " + CantidadCarpetas + "Unidades ---> Precio c/u: "
                    + precioCarpeta + " \n SubTotal: " + totalCarpeta;
            mensaje += "\n";
            totalPapelote += CantidadPapelotes * precioPapelote;
            mensaje += "Papelotes: " + CantidadPapelotes + "Unidades ---> Precio c/u: "
                    + precioPapelote + " \n SubTotal: " + totalPapelote;
            totalCompra = totalLibro + totalCuaderno
                    + totalLapicero + totalColor + totalMochila + totalPlumon + totalCarpeta + totalPapelote;
            mensaje += " \n Total de los Productos " + totalCompra;
        }
        return mensaje;
    
}
    
}
