package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                        <li class=\"sidebar-search\">\r\n");
      out.write("                            <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /input-group -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                         <li>\r\n");
      out.write("                            <a href=\"index.jsp\"><i class=\"fa fa-dashboard fa-fw\"></i> Dashboard</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                     <!--   <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Admission<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"admission_new.jsp\">New Admission</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"admission_view.jsp\">View Admission</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"tables.html\"><i class=\"fa fa-table fa-fw\"></i> Tables</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"forms.html\"><i class=\"fa fa-edit fa-fw\"></i> Forms</a>\r\n");
      out.write("                        </li> -->\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i> Faculty<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"faculty_new.jsp\">New Faculty</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"faculty_view.jsp\">View Faculty</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                 <li>\r\n");
      out.write("                                    <a href=\"faculty_account.jsp\">Faculty Login Account </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.nav-second-level -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i> Subjects<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"subject_new.jsp\">Add New Subject</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"subject_view.jsp\">View Subjects</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.nav-second-level -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i> Students<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"student_new.jsp\">New Student</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"student_view.jsp\">View Students</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.nav-second-level -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i> Events<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"event_new.jsp\">New Event</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"event_view.jsp\">View Events</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.nav-second-level -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i> Internal Marks<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"internal_marks.jsp\">Add Internal Marks</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                              \r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.nav-second-level -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.sidebar-collapse -->\r\n");
      out.write("            </div>");
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
