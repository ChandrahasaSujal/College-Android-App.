<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <jsp:include page="includes/title.jsp"></jsp:include>

    <!-- Bootstrap Core CSS -->
    <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            
            <!-- /.navbar-header -->

            <jsp:include page="includes/header.jsp"></jsp:include>
            <!-- /.navbar-top-links -->

            <jsp:include page="includes/menu.jsp"></jsp:include>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
           <%
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
           
           %>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Add New Subject
                        </div>
                        <div class="panel-body">
                        
                            <div class="row">
                                <div class="col-lg-12">
                                <form action="internal_marks1.jsp">
                                <input type='hidden' name='mode' id='mode' value='save'>
                                <input type='hidden' name='sem' id='sem' value='<%=request.getParameter("sem") %>'>
                                <input type='hidden' name='department' id='department' value='<%=request.getParameter("department") %>'>
                                <input type='hidden' name='internal' id='internal' value='<%=request.getParameter("internal") %>'>
                               <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <tr><td>SlNo</td><td>Student Name</td><td>Regno</td>
                                <%
                                Connection con =DBConnectivity.getCon();
                                Statement st = con.createStatement();
                                int sub_count=0;
                                ResultSet rs = st.executeQuery("select * from subjects where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                while(rs.next())
                                {sub_count++;
                                	%>                                	
                                		<td><%=rs.getString("subject_name") %></td>                   	
                                	<%
                                }
                                %>
                                </tr><input type='hidden' name='sub_count' id='sub_count' value='<%=sub_count%>'>
                                 <%
                               int i=0;
                                 
                                Statement st1 = con.createStatement();
                                ResultSet rs1 = st1.executeQuery("select * from students where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                while(rs1.next())
                                {int j=1;
                                	%>
                                	<tr>
                                		<td><%=++i %></td><td>
                                		<input type='hidden' name='student_id<%=i%>' id='student_id<%=i%>' value='<%=rs1.getString("student_id") %>'>
                                		
                                		<%=rs1.getString("student_name") %></td>
                                		<td><%=rs1.getString("reg_no") %></td>
                                		<%
                                		 Statement st2 = con.createStatement();
                                        ResultSet rs2 = st2.executeQuery("select * from subjects where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'");
                                        while(rs2.next())
                                        {
                                        	%>                                	
                                        		<td><input type='text' size='5' name='marks<%=i%>_<%=j%>' id='marks<%=i%>_<%=j%>'>
                                        		<input type='hidden' name='subject_id<%=i%>_<%=j%>' id='subject_id<%=i%>_<%=j++%>' value='<%=rs2.getString("subject_id")%>'>      
                                        		</td>             	
                                        	<%
                                        }
                                		%>
                                	</tr>
                                	<%
                                }
                                %>
                                </table>
                                <input type='hidden' name='count' id='count' value='<%=i%>'>
                                <input type='submit' value='Save'>
                                </form>
                                
                                    
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

</body>

</html>
