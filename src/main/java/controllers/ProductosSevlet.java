package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Productos;
import services.ProductoService;
import services.ProductoServiceImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// Anotaciones
@WebServlet("/clientes")
public class ProductosSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService service = new ProductoServiceImplement();
        List<Productos> clientes = service.listar();
        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition", "attachment; filename=clientes.pdf");


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        // Creo la plantilla HTML para mostrar la lista de clientes
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Listar Clientes</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Lista de Clientes</h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID Cliente</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Dirección</th>");
        out.println("<th>Tipo Documento</th>");
        out.println("<th>Número Documento</th>");
        out.println("<th>Teléfono</th>");
        out.println("</tr>");

        // Iterar sobre la lista de clientes y mostrar sus datos
        clientes.forEach(c -> {
            out.println("<tr>");
            out.println("<td>" + c.getIdCliente() + "</td>");
            out.println("<td>" + c.getNombre() + "</td>");
            out.println("<td>" + c.getDireccion() + "</td>");
            out.println("<td>" + c.getTipoDocumento() + "</td>");
            out.println("<td>" + c.getNumeroDocumento() + "</td>");
            out.println("<td>" + c.getTelefono() + "</td>");
            out.println("</tr>");
        });

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
