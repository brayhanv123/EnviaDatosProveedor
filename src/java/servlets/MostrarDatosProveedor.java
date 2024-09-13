/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/MostrarDatosProveedor")
public class MostrarDatosProveedor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtener los datos del formulario
        String nombre = request.getParameter("nombre_prov");
        String direccion = request.getParameter("direccion_prov");
        String telefono = request.getParameter("telefono_prov");

        // Mostrar los datos del proveedor en la respuesta
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos del Proveedor</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Datos Ingresados del Proveedor</h2>");
            out.println("<p><strong>Nombre:</strong> " + nombre + "</p>");
            out.println("<p><strong>Dirección:</strong> " + direccion + "</p>");
            out.println("<p><strong>Teléfono:</strong> " + telefono + "</p>");
            out.println("<a href='index.html'>Volver al formulario</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
