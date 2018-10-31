package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">College App</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>Read All Messages</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-messages -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-tasks fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 1</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">40% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\r\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 2</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">20% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\r\n");
      out.write("                                            <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 3</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 4</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">80% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\r\n");
      out.write("                                            <span class=\"sr-only\">80% Complete (danger)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>See All Tasks</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-tasks -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-bell fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i> New Comment\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">12 minutes ago</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-tasks fa-fw\"></i> New Task\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>See All Alerts</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-alerts -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-user -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("            </ul>");
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
