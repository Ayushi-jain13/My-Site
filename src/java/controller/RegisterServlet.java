
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
         System.out.println("heya");
        response.sendRedirect("index.jsp");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();
       
        String Name = request.getParameter("username"); 
        String Email= request.getParameter("email");
        String Phone = request.getParameter("phone");
        String City = request.getParameter("city");
        String password = request.getParameter("password");

                Statement st=null;
                PreparedStatement ps=null;
                Connection con=null;
                DBConnector db=new DBConnector();
                st=DBConnector.getStatement();
    
               try
               {
                String query="insert into register Values(?,?,?,?,?)";
                
                con=db.getConnection();
                ps=con.prepareStatement(query);
                ps.setString(1,Name);
                ps.setString(2,Email);
                ps.setString(3,Phone);
                ps.setString(4,City);
                ps.setString(5,password);

                int x=ps.executeUpdate();
                if(x>0)
                {
                System.out.println("record inserted");
                out.println("<script type=\"text/javascript\">"); 
                out.println("alert('Registration successfull');"); 
                out.println("location='index.jsp';"); 
                out.println("</script>"); 

                }
                else
                {
                    System.out.println("record insertion failed");
                }
               }
               catch(SQLException e)
               {
                   System.out.println(e);
                    out.println("<script type=\"text/javascript\">"); 
                    out.println("alert('Select a unique username!');"); 
                    out.println("location='index.jsp';"); 
                    out.println("</script>"); 
               }
    }
}
