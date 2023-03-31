package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Ayushi jain</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Css/style.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            color: #ffffff;\n");
      out.write("            background: #000000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loading {\n");
      out.write("            color: #d1d1d1;\n");
      out.write("            padding: 20px;\n");
      out.write("            font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 0\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main {\n");
      out.write("            opacity: 1;\n");
      out.write("            transition: opacity .2s ease-in-out\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main.not-loaded {\n");
      out.write("            opacity: 0\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        [data-name=corner-bottom-right],\n");
      out.write("        [data-name=corner-top-left] {\n");
      out.write("            opacity: 1;\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            transition: all ease-in-out;\n");
      out.write("            position: absolute\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        [data-name=corner-top-left] {\n");
      out.write("            top: 0;\n");
      out.write("            left: 0\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        [data-name=corner-bottom-right] {\n");
      out.write("            opacity: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            right: 0\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .not-loaded [data-name=corner-top-left],\n");
      out.write("        .not-loaded [data-name=corner-bottom-right] {\n");
      out.write("            opacity: 0 !important;\n");
      out.write("            width: 0 !important;\n");
      out.write("            height: 0 !important\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media screen and (min-width:500px) {\n");
      out.write("\n");
      out.write("            [data-name=corner-bottom-right],\n");
      out.write("            [data-name=corner-top-left] {\n");
      out.write("                width: 300px;\n");
      out.write("                height: 300px;\n");
      out.write("                opacity: 1\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .gradient1 {\n");
      out.write("            stop-color: var(--grad-1);\n");
      out.write("            transition: all .3s ease-in-out\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .gradient2 {\n");
      out.write("            stop-color: var(--grad-2);\n");
      out.write("            transition: all .3s ease-in-out\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hover .gradient1 {\n");
      out.write("            stop-color: var(--grad-2)\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hover .gradient2 {\n");
      out.write("            stop-color: var(--grad-1)\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"media.css\">\n");
      out.write("    <script src=\"/index.28a0c5dd.js\" defer></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"navigation\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"logo-removebg-preview (1).png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <a href=\"https://github.com/Ayushi-jain13\" class=\"nav-logo logo1\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("                <a href=\"ayushij1304@gmail.com\" class=\"nav-logo logo2\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("                <a href=\"login.jsp\" class=\"nav-logo logo3\"><i class=\"fa fa-user\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"column left\">\n");
      out.write("            <h1>Welcome.</h1>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p>My name is Ayushi Jain. I am a Web developer based in Indore , Madhya Pradesh. I have developed\n");
      out.write("                    projects to\n");
      out.write("                    enhance my skills.</p>\n");
      out.write("                <p>I'm passionate about learning new things everyday.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column right\">\n");
      out.write("            <img src=\"images/vector.jpg\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <span>My Projects</span>\n");
      out.write("\n");
      out.write("        <!-- blogs section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"blogs\" id=\"blogs\">\n");
      out.write("\n");
      out.write("            <div class=\"heading\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        \n");
      out.write("                        <h3>Meals On Wheels</h3>\n");
      out.write("                        <p>Meals on wheels is a web based application developed on netbeans. The main aim of this website is to keep the neighbourhood hunger free.....</p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <!-- <div class=\"tags\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> young adult fiction / </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> romance </a>\n");
      out.write("                        </div> -->\n");
      out.write("                        <h3>Epic Food</h3>\n");
      out.write("                        <p>Different spices for different tastes. A food ordering website where one has to login before adding items to cart or adding them to favourites .....\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <!-- <div class=\"image\">\n");
      out.write("                        <h3> <i class=\"fas fa-calendar\"></i> 2nd april, 2022 </h3>\n");
      out.write("                        <img src=\"image/blog-3.jpg\" alt=\"\">\n");
      out.write("                    </div> -->\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <!-- <div class=\"tags\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> young adult / </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> thriller</a>\n");
      out.write("                        </div> -->\n");
      out.write("                        <h3>My Portfolio</h3>\n");
      out.write("                        <p>A website where one can find my resume, contact me , view my proejcts and also visit my github account and view the skills I have....</p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <section class=\"blogs\" id=\"blogs\">\n");
      out.write("\n");
      out.write("            <div class=\"heading\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <!-- <div class=\"image\">\n");
      out.write("                        <h3> <i class=\"fas fa-calendar\"></i> 2nd april, 2022 </h3>\n");
      out.write("                        <img src=\"image/blog-1.jpg\" alt=\"\">\n");
      out.write("                    </div> -->\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <!-- <div class=\"tags\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> self help </a>\n");
      out.write("                        </div> -->\n");
      out.write("                        <h3>Notepad Clone</h3>\n");
      out.write("                        <p>As the name itself suggests that it is clone of notepad, it has similar interface as original notepad and basic functionalities of notepad like new, save, Open a file etc. </p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <!-- <div class=\"image\">\n");
      out.write("                        <h3> <i class=\"fas fa-calendar\"></i> 2nd april, 2022 </h3>\n");
      out.write("                        <img src=\"image/blog-2.jpg\" alt=\"\">\n");
      out.write("                    </div> -->\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <!-- <div class=\"tags\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> young adult fiction / </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> romance </a>\n");
      out.write("                        </div> -->\n");
      out.write("                        <h3>E-notes</h3>\n");
      out.write("                        <p>Clone of notes app , but this is in website form where one can register and login, and then write notes delete them ,edit them, save etc......\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <!-- <div class=\"image\">\n");
      out.write("                        <h3> <i class=\"fas fa-calendar\"></i> 2nd april, 2022 </h3>\n");
      out.write("                        <img src=\"image/blog-3.jpg\" alt=\"\">\n");
      out.write("                    </div> -->\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <!-- <div class=\"tags\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> young adult / </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-tag\"></i> thriller</a>\n");
      out.write("                        </div> -->\n");
      out.write("                        <h3>Book Rent</h3>\n");
      out.write("                        <p>Different fictions , all the genres like romance, horror, sci-fi, thriller, comedy etc. can be found on this website for renting. It works 24*7.... </p>\n");
      out.write("                        <a href=\"https://github.com/Ayushi-jain13\" class=\"btn\" onclick=\"alert('Please Login !')\">Github</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- blogs section ends-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--<div>\n");
      out.write("    <img src=\"images/vector.jpg\">\n");
      out.write("</div> -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"tech\">\n");
      out.write("        <span>Skills</span>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"skillContainer\">\n");
      out.write("            <div class=\"set\">\n");
      out.write("                <ul class=\"vl\"> Java </ul><div class=\"rectangle cl-1\"></div> 95%\n");
      out.write("                <!-- <ul class=\"vl\"> MySql </ul><div class=\"rectangle cl-2\"></div> -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"set\"><ul class=\"vl\">  MySql </ul><div class=\"rectangle cl-2\"></div>90%\n");
      out.write("        </div>\n");
      out.write("            <div class=\"set\">\n");
      out.write("                <ul class=\"vl\"> C </ul><div class=\"rectangle cl-3\"></div>85%\n");
      out.write("                <!-- <ul class=\"vl\"> C++ </ul><div class=\"rectangle cl-4\"></div> -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"set\"><ul class=\"vl\">  C++   </ul><div class=\"rectangle cl-4\"></div>75%</div>\n");
      out.write("            <div class=\"set\">\n");
      out.write("                <ul class=\"vl\"> Html </ul><div class=\"rectangle cl-5\"></div>95%\n");
      out.write("                <!-- <ul class=\"vl\"> Css </ul><div class=\"rectangle cl-6\"></div> -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"set\"><ul class=\"vl\">  Css   </ul><div class=\"rectangle cl-6\"></div> 90%</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-1\">\n");
      out.write("        <span>Resume</span><br>\n");
      out.write("        <div class=\"resume\">\n");
      out.write("            <a href=\"/RESUME_2023_Ayushi.pdf\" target=\"_blank\"><button class=\"btn\"> Download CV</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p> ©2023 ayushij1304.com</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}