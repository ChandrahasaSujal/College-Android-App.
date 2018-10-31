package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnectivity;
import java.sql.Connection;

public final class internal_005fmarks1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           ");

           if(request.getParameter("mode")!=null)
           {
        	   	Connection con = DBConnectivity.getCon();
        	   	Statement st = con.createStatement();
        	   	int count=Integer.parseInt(request.getParameter("count"));
        	   	int sub_count=Integer.parseInt(request.getParameter("sub_count"));
        	   	
				for(int i=1;i<=count;i++)
				{
					String Student_id=request.getParameter("student_id"+i);
					String sem=request.getParameter("sem");
					String internal=request.getParameter("internal");
					
					for(int j=1;j<=sub_count;j++)
					{
						String subject_id=request.getParameter("subject_id"+i+"_"+j);
						String marks=request.getParameter("marks"+i+"_"+j);
						st.execute("insert into marks(marks_id, student_id, sem, internal, subject_id, marks_obtained) values(0,'"+Student_id+"','"+sem+"','"+internal+"','"+subject_id+"','"+marks+"')");
					}
					
				}
           }
           
           
      out.write("\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                           Add New Subject\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                <form action=\"internal_marks1.jsp\">\n");
      out.write("                                <input type='hidden' name='mode' id='mode' value='save'>\n");
      out.write("                                <input type='hidden' name='sem' id='sem' value='");
      out.print(request.getParameter("sem") );
      out.write("'>\n");
      out.write("                                <input type='hidden' name='department' id='department' value='");
      out.print(request.getParameter("department") );
      out.write("'>\n");
      out.write("                                <input type='hidden' name='internal' id='internal' value='");
      out.print(request.getParameter("internal") );
      out.write("'>\n");
      out.write("                               <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                <tr><td>SlNo</td><td>Student Name</td><td>Regno</td>\n");
      out.write("                                ");

                                Connection con =DBConnectivity.getCon();
                                Statement st = con.createStatement();
                                int sub_count=0;
                                ResultSet rs = st.executeQuery("select * from subjects where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                while(rs.next())
                                {sub_count++;
                                	
      out.write("                                \t\n");
      out.write("                                \t\t<td>");
      out.print(rs.getString("subject_name") );
      out.write("</td>                   \t\n");
      out.write("                                \t");

                                }
                                
      out.write("\n");
      out.write("                                </tr><input type='hidden' name='sub_count' id='sub_count' value='");
      out.print(sub_count);
      out.write("'>\n");
      out.write("                                 ");

                               int i=0;
                                 
                                Statement st1 = con.createStatement();
                                ResultSet rs1 = st1.executeQuery("select * from students where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                while(rs1.next())
                                {int j=1;
                                	
      out.write("\n");
      out.write("                                \t<tr>\n");
      out.write("                                \t\t<td>");
      out.print(++i );
      out.write("</td><td>\n");
      out.write("                                \t\t<input type='hidden' name='student_id");
      out.print(i);
      out.write("' id='student_id");
      out.print(i);
      out.write("' value='");
      out.print(rs1.getString("student_id") );
      out.write("'>\n");
      out.write("                                \t\t\n");
      out.write("                                \t\t");
      out.print(rs1.getString("student_name") );
      out.write("</td>\n");
      out.write("                                \t\t<td>");
      out.print(rs1.getString("reg_no") );
      out.write("</td>\n");
      out.write("                                \t\t");

                                		 Statement st2 = con.createStatement();
                                        ResultSet rs2 = st2.executeQuery("select * from subjects where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                        while(rs2.next())
                                        {
                                        	
      out.write("                                \t\n");
      out.write("                                        \t\t<td><input type='text' size='5' name='marks");
      out.print(i);
      out.write('_');
      out.print(j);
      out.write("' id='marks");
      out.print(i);
      out.write('_');
      out.print(j);
      out.write("'>\n");
      out.write("                                        \t\t<input type='hidden' name='subject_id");
      out.print(i);
      out.write('_');
      out.print(j);
      out.write("' id='subject_id");
      out.print(i);
      out.write('_');
      out.print(j++);
      out.write("' value='");
      out.print(rs2.getString("subject_id"));
      out.write("'>      \n");
      out.write("                                        \t\t</td>             \t\n");
      out.write("                                        \t");

                                        }
                                		
      out.write("\n");
      out.write("                                \t</tr>\n");
      out.write("                                \t");

                                }
                                
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <input type='hidden' name='count' id='count' value='");
      out.print(i);
      out.write("'>\n");
      out.write("                                <input type='submit' value='Save'>\n");
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
