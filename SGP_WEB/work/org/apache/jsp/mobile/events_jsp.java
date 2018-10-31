package org.apache.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnectivity;
import java.sql.Connection;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"content yellow\">\n");
      out.write("\t<h1>Events</h1>\n");
      out.write("</div>\n");
      out.write("<!--/.content-->\n");
      out.write("<div class=\"content\">\n");
      out.write("<h2 style=\"color: green\">Current Events</h2>\n");
      out.write("<table border=1 cellspacing=0 cellpadding=0>\n");
      out.write("<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>\n");

DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//get current date time with Date()
Date date = new Date();


Connection con= DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date='"+dateFormat.format(date)+"' order by event_date desc");
while(rs.next())
{

      out.write("\n");
      out.write("<tr><td>");
      out.print(rs.getString("event_name"));
      out.write("</td><td>");
      out.print(rs.getString("event_date"));
      out.write("</td><td>");
      out.print(rs.getString("event_desc"));
      out.write("</td></tr>\n");
} 
      out.write("\n");
      out.write("</table>\t<br/>\n");
      out.write("\n");
      out.write("<h2 style=\"color: green\">Future Events</h2>\n");
      out.write("<table border=1 cellspacing=0 cellpadding=0>\n");
      out.write("<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>\n");




Statement st2 = con.createStatement();
ResultSet rs2 = st2.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date>'"+dateFormat.format(date)+"' order by event_date desc");
while(rs2.next())
{

      out.write("\n");
      out.write("<tr><td>");
      out.print(rs2.getString("event_name"));
      out.write("</td><td>");
      out.print(rs2.getString("event_date"));
      out.write("</td><td>");
      out.print(rs2.getString("event_desc"));
      out.write("</td></tr>\n");
} 
      out.write("\n");
      out.write("</table>\t<br/><br/>\n");
      out.write("<h2 style=\"color: green\">Past Events</h2>\n");
      out.write("\n");
      out.write("<table border=1 cellspacing=0 cellpadding=0>\n");
      out.write("<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>\n");



Statement st1 = con.createStatement();
ResultSet rs1 = st.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date<'"+dateFormat.format(date)+"' order by event_date desc");
while(rs1.next())
{

      out.write("\n");
      out.write("<tr><td>");
      out.print(rs1.getString("event_name"));
      out.write("</td><td>");
      out.print(rs1.getString("event_date"));
      out.write("</td><td>");
      out.print(rs1.getString("event_desc"));
      out.write("</td></tr>\n");
} 
      out.write("\n");
      out.write("</table>\t\n");
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
