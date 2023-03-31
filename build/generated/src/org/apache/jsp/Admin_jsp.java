package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import db.DBConnector;
import db.DBConnector;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("        <!-- META TAGS -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- FAV ICON(BROWSER TAB ICON) -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fav.ico\" type=\"image/x-icon\">\n");
      out.write("        <!-- GOOGLE FONT -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700%7CJosefin+Sans:600,700\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- FONTAWESOME ICONS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- ALL CSS FILES -->\n");
      out.write("        <link href=\"Css/materialize.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"Css/admin_style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- RESPONSIVE.CSS ONLY FOR MOBILE AND TABLET VIEWS -->\n");
      out.write("        <link href=\"Css/style-mob.css\" rel=\"stylesheet\" />\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Muli&display=swap');\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Quicksand&display=swap');\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--== MAIN CONTRAINER ==-->\n");
      out.write("        <div class=\"container-fluid sb1\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--== LOGO ==-->\n");
      out.write("                <div class=\"col-md-2 col-sm-3 col-xs-6 sb1-1\">\n");
      out.write("                    <a href=\"#\" class=\"btn-close-menu\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"atab-menu\"><i class=\"fa fa-bars tab-menu\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"index.jsp\" class=\"logo\"><img src=\"\" alt=\"\" />\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a class='waves-effect dropdown-button top-user-pro' href='#' data-activates='top-menu'><img\n");
      out.write("                        src=\"user/6.png\" alt=\"\" />My Account <i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Dropdown Structure -->\n");
      out.write("                <ul id='top-menu' class='dropdown-content top-menu-sty'>\n");
      out.write("\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li><a href=\"logout.jsp\" class=\"ho-dr-con-last waves-effect\"><i class=\"fa fa-sign-in\"\n");
      out.write("                                                                                    aria-hidden=\"true\"></i> Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--== BODY CONTNAINER ==-->\n");
      out.write("    <div class=\"container-fluid sb2\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"sb2-1\">\n");
      out.write("\n");
      out.write("                <!--== USER INFO ==-->\n");
      out.write("                <div class=\"sb2-12\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><img src=\"images/placeholder.jpg\" alt=\"\">\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <h5>Ayushi Jain<span> India</span></h5>\n");
      out.write("                        </li>\n");
      out.write("                        <li></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--== LEFT MENU ==-->\n");
      out.write("                <div class=\"sb2-13\">\n");
      out.write("                    <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                        <li><a href=\"javascript:void(0)\" class=\"collapsible-header\"><i class=\"fa fa-user\"aria-hidden=\"true\"></i> Admin</a></li>\n");
      out.write("                        <li><a href=\"javascript:void(0)\" class=\"collapsible-header\"><i class=\"fa fa-graduation-cap\"aria-hidden=\"true\"></i> Dashboard</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\" class=\"collapsible-header\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i>My Portfolio</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\" class=\"collapsible-header\"><i class=\"fa fa-commenting-o\"aria-hidden=\"true\"></i>Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--== BODY INNER CONTAINER ==-->\n");
      out.write("            <div class=\"sb2-2\">\n");
      out.write("                <!--== breadcrumbs ==-->\n");
      out.write("                <div class=\"sb2-2-2\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Admin.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active-bre\"><a href=\"Admin.jsp\"> Dashboard</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--== DASHBOARD INFO ==-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"sb2-2-1\">\n");
      out.write("                    <h2>Admin Dashboard</h2>\n");
      out.write("                    <!--== Connection ==-->\n");
      out.write("\n");
      out.write("                    <div class=\"db-2\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"dash-book dash-b-1\">\n");
      out.write("                                    <h5>All Donations</h5>\n");
      out.write("\n");
      out.write("                                    <h4>18</h4>\n");
      out.write("                                    <a href=\"#\">View more</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"dash-book dash-b-2\">\n");
      out.write("                                    <h5>Volunteered</h5>\n");
      out.write("                                    <h4>10</h4>\n");
      out.write("                                    <a href=\"#\">View more</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"dash-book dash-b-3\">\n");
      out.write("                                    <h5>Registered</h5>\n");
      out.write("                                    <h4>12</h4>\n");
      out.write("                                    <a href=\"#\">View more</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"dash-book dash-b-4\">\n");
      out.write("                                    <h5>Enquiry</h5>\n");
      out.write("                                    <h4>2</h4>\n");
      out.write("                                    <a href=\"#\">View more</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    Statement st = null;
                    Connection con = null;
                    DBConnector db = new DBConnector();
                    st = DBConnector.getStatement();
                    String sql = "select * from register";
                    ResultSet rs1=st.executeQuery(sql);
                
      out.write("\n");
      out.write("                <div class=\"sb2-2-3\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!--== Country Campaigns ==-->\n");
      out.write("                        <div class=\"col-md-100\">\n");
      out.write("                            <div class=\"box-inn-sp\">\n");
      out.write("                                <div class=\"inn-title\">\n");
      out.write("                                    <h4>Visitors</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-inn\">\n");
      out.write("                                    <div class=\"table-responsive table-desi\">\n");
      out.write("                                        <table class=\"table table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Name</th>\n");
      out.write("                                                    <th>Email</th>\n");
      out.write("                                                    <th>Phone</th>\n");
      out.write("                                                    <th>City</th>\n");
      out.write("                                                    <th>Date</th>\n");
      out.write("\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 while (rs1.next()) 
                                                     {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("<!--                                                    <td>*</td>-->\n");
      out.write("                                                    <td><span class=\"txt-dark weight-500\">");
      out.print(rs1.getString(1));
      out.write("</span></td>\n");
      out.write("                                                    <td>");
      out.print(rs1.getString(2));
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(rs1.getString(3));
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(rs1.getString(4));
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(rs1.getString(5));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                </tr> \n");
      out.write("                                                ");
 }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Import jQuery before materialize.js-->\n");
      out.write("                        <script src=\"js/main.min.js\"></script>\n");
      out.write("                        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                        <script src=\"js/materialize.min.js\"></script>\n");
      out.write("                        <script src=\"js/custom.js\"></script>\n");
      out.write("                        </body>\n");
      out.write("                        </html>");
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
