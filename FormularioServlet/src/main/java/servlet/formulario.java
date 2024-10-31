/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bell
 */
public class formulario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("name");
        String apellido = request.getParameter("lastName");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("password");
        String genero = request.getParameter("gender");
        String hobbies = request.getParameter("hobbies");
        String sourceIncome = request.getParameter("source");
        String ingresos = request.getParameter("income");
        String edad = request.getParameter("age");
        String biografia = request.getParameter("bio");

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(email);
        System.out.println(contraseña);
        System.out.println(genero);
        System.out.println(hobbies);
        System.out.println(sourceIncome);
        System.out.println(ingresos);
        System.out.println(edad);
        System.out.println(biografia);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino = "formulario.jsp";
        
        String nombre = request.getParameter("name");
        String apellido = request.getParameter("lastName");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("password");
        String genero = request.getParameter("gender");
        String hobbies = request.getParameter("hobbies");
        String sourceIncome = request.getParameter("source");
        String ingresos = request.getParameter("income");
        String edad = request.getParameter("age");
        String biografia = request.getParameter("bio");

        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("email", email);
        request.setAttribute("contraseña", contraseña);
        request.setAttribute("genero", genero);
        request.setAttribute("hobby", hobbies);
        request.setAttribute("source", sourceIncome);
        request.setAttribute("ingresos", ingresos);
        request.setAttribute("edad", edad);
        request.setAttribute("bio", biografia);

        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
