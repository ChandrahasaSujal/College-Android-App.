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

    <!-- DataTables CSS -->
    <link href="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">

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
            <div class="row">
             
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Subjects List
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <form action="subject_view.jsp">
                            <table>
                           <tr style="height: 50px"><td>Department</td><td><select name='department' id='department'>
                                	<option value='COMPUTER SCIENCE'>COMPUTER SCIENCE</option>
                                	<option value='ELECTRONICS & COMMUNICATION'>ELECTRONICS & COMMUNICATION</option>
                                	<option value='ELECTRICAL & ELECTRONICS ENGG'>ELECTRICAL & ELECTRONICS ENGG</option>
                                	<option value='MECHANICAL'>MECHANICAL</option>
                                	<option value='METALLURGY'>METALLURGY</option>
                                	<option value='CIVIL ENGG'>CIVIL ENGG</option>
                                </select></td>
<td>Sem</td><td><select name='sem' id='sem'>
                                	<option value='SEM 1'>SEM 1</option>
                                	<option value='SEM 2'>SEM 2</option>
                                	<option value='SEM 3'>SEM 3</option>
                                	<option value='SEM 4'>SEM 4</option>
                                	<option value='SEM 5'>SEM 5</option>
                                	<option value='SEM 6'>SEM 6</option>
                                </select></td>
                                
                                <td><input type='submit' value='Get Subjects'></td>
                                </tr>
                            </table>
                            </form><br>
                            
                           
                            
                            
                            
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Department</th>
                                            <th>Sem</th>
                                            <th>Subject</th>
                                            <th>Subject Type</th>
                                            <th>Action</th>                                           
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <%
                                    String q="";
                                    if(request.getParameter("department")!=null)
                                    {
                                    	q=" where dept='"+request.getParameter("department")+"' and sem='"+request.getParameter("sem")+"'";
                                    Connection con = DBConnectivity.getCon();
                                    Statement st = con.createStatement();
                                    ResultSet rs = st.executeQuery("select subject_id, dept, sem, subject_name, subject_type from subjects"+q);
                                    while(rs.next())
                                    {
                                    %>
                                        <tr class="odd gradeX">
                                            <td><%=rs.getString("dept") %></td>
                                            <td><%=rs.getString("sem") %></td>
                                            <td><%=rs.getString("subject_name") %></td>
                                            <td><%=rs.getString("subject_type") %></td>
                                            <td><a href="subject_delete.jsp?subject=<%=rs.getString("subject_id")%>">Delete</a></td>
                                            
                                        </tr>
                                     <%} }%>
                                      
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                         
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <!-- /.row -->
            
            <!-- /.row -->
            
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

    <!-- DataTables JavaScript -->
    <script src="bower_components/DataTables/media/js/jquery.dataTables.min.js"></script>
    <script src="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>

</body>

</html>
