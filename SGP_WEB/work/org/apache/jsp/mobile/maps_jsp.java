package org.apache.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnectivity;
import java.sql.Connection;

public final class maps_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/title.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<link href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css' rel='stylesheet'>\n");
      out.write("<link href='css/bootstrap_font.css' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='css/font.css' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='css/style.css' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--/.header-->\n");
      out.write("\n");
      out.write("<!--/.content-->\n");
      out.write("<div class=\"content\">\n");
      out.write("\n");
      out.write("<iframe src=\"https://www.google.com/maps/embed?pb=!1m24!1m12!1m3!1d61617.38927746966!2d76.8751290965877!3d15.153575404528933!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m9!1i0!3e6!4m0!4m5!1s0x3bb713d05563bf0d%3A0xe98b678ac5881dda!2ssanjay+gandhi+polytechnic+bellary!3m2!1d15.153578!2d76.90946199999999!5e0!3m2!1sen!2sin!4v1425627047826\" width=\"400\" height=\"350\" frameborder=\"0\" style=\"border:0\"></iframe>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-------------------- JS -------------------->\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $('.slideout-menu-toggle').on('click', function(event){\n");
      out.write("    \tevent.preventDefault();\n");
      out.write("    \t// create menu variables\n");
      out.write("    \tvar slideoutMenu = $('.slideout-menu');\n");
      out.write("    \tvar slideoutMenuWidth = $('.slideout-menu').width();\n");
      out.write("    \t\n");
      out.write("    \t// toggle open class\n");
      out.write("    \tslideoutMenu.toggleClass(\"open\");\n");
      out.write("    \t\n");
      out.write("    \t// slide menu\n");
      out.write("    \tif (slideoutMenu.hasClass(\"open\")) {\n");
      out.write("\t    \tslideoutMenu.animate({\n");
      out.write("\t\t    \tleft: \"0px\"\n");
      out.write("\t    \t});\t\n");
      out.write("    \t} else {\n");
      out.write("\t    \tslideoutMenu.animate({\n");
      out.write("\t\t    \tleft: -slideoutMenuWidth\n");
      out.write("\t    \t}, 250);\t\n");
      out.write("    \t}\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
