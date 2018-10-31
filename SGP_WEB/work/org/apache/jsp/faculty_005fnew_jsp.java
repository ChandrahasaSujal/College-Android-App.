package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faculty_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/title.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            \n");
      out.write("            <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/menu.jsp", out, false);
      out.write("\n");
      out.write("            <!-- /.navbar-static-side -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("           \n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                           Add New Faculty\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                <form action=\"faculty_save.jsp\">\n");
      out.write("                                <table>\n");
      out.write("                                <tr style=\"height: 50px\"><td>Faculty Name</td><td><input type='text' name='name' id='name'>\n");
      out.write("                                <tr style=\"height: 50px\"><td>Mobile</td><td><input type='text' name='mobile' id='mobile'>\n");
      out.write("                                <tr style=\"height: 50px\"><td>Email</td><td><input type='text' name='email' id='email'>\n");
      out.write("                                 <tr style=\"height: 50px\"><td>Designation</td><td><select name='designation' id='designation'>\n");
      out.write("                                \t<option value='Principle'>Principle</option>\n");
      out.write("                                \t<option value='Hod'>Hod</option>\n");
      out.write("                                \t<option value='Lecturer'>Lecturer</option>\n");
      out.write("                                \t<option value='Ass. Lecturer'>Ass. Lecturer</option>\n");
      out.write("                                \t\n");
      out.write("                                </select></td></tr>\n");
      out.write("                                <tr style=\"height: 50px\"><td>Department</td><td><select name='department' id='department'>\n");
      out.write("                                \t<option value='COMPUTER SCIENCE'>COMPUTER SCIENCE</option>\n");
      out.write("                                \t<option value='ELECTRONICS & COMMUNICATION'>ELECTRONICS & COMMUNICATION</option>\n");
      out.write("                                \t<option value='ELECTRICAL & ELECTRONICS ENGG'>ELECTRICAL & ELECTRONICS ENGG</option>\n");
      out.write("                                \t<option value='MECHANICAL'>MECHANICAL</option>\n");
      out.write("                                \t<option value='METALLURGY'>METALLURGY</option>\n");
      out.write("                                \t<option value='CIVIL ENGG'>CIVIL ENGG</option>\n");
      out.write("                                </select></td></tr>\n");
      out.write("                             \n");
      out.write("                                <tr><td></td><td><input type='submit' value='Save'></td></tr>\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                                </form>\n");
      out.write("                                \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.col-lg-6 (nested) -->\n");
      out.write("                                \n");
      out.write("                                <!-- /.col-lg-6 (nested) -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.row (nested) -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"bower_components/metisMenu/dist/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"dist/js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
