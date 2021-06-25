/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calculator.consumer;
import org.calculator.Add;
import org.calculator.AddService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;


    @WebServlet(name = "calculatorConsumerServlet", urlPatterns = {"/calculatorConsumerServlet"}) 
    public class calculatorConsumerServlet extends HttpServlet {
        @WebServiceRef(wsdlLocation ="http://localhost:34250/calculatorService/addService?wsdl")
    //calculatorService service;
        public org.calculator.AddService_Service service;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            org.calculator.AddService port= service.getAddServicePort();
            int i = Integer.parseInt(request.getParameter("num1")); 
            int j = Integer.parseInt(request.getParameter("num2"));
            String res = port.add(i, j);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculatorConsumerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculatorConsumerServlet at " + request.getContextPath() + "</h1>");
            out.println("<br/> Addition <br/>" + i + " + " + j + " = " + port.add(i,j) );
//            out.println("<br/> Subtraction <br/>" + i + " - " + j + " = " + port.sub(i,j) );
//            out.println("<br/> Multiplication <br/>" + i + " * " + j + " = " + port.mul(i,j) );
//            if(j!=0)
//                out.println("<br/> Division <br/>" + i + " / " + j + " = " + port.div(i,j) );
//            else
//                out.println("<br/> Division <br/>" + i + " / " + j + " = " + "Invalid" );
//            
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
