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
           
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Add New Event
                        </div>
                        <div class="panel-body">
                        
                            <div class="row">
                                <div class="col-lg-6">
                                <form action="event_save.jsp">
                                <table>
                             
                                <tr style="height: 50px"><td>Event Name</td><td><input type='text' name='event' id='event'></td></tr>
                                 <tr style="height: 50px"><td>Event Date</td><td><input type='date' name='date' id='date'></td></tr>
                                 <tr style="height: 50px"><td>Description</td><td><textarea name='desc' id='desc'></textarea></td></tr>
                                <tr><td></td><td><input type='submit' value='Save'></td></tr>
                                </table>
                                
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
                
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           View Events
                        </div>
                        <div class="panel-body">
                        
                            <div class="row">
                                <div class="col-lg-12">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Event Name</th>
                                            <th>Date</th>
                                            <th>Desc</th>
                                          
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <%
                                    Connection con = DBConnectivity.getCon();
                                    Statement st = con.createStatement();
                                    ResultSet rs = st.executeQuery("select event_id, event_name, event_date, event_desc from event order by event_date desc");
                                    while(rs.next())
                                    {
                                    %>
                                        <tr class="odd gradeX">
                                            <td><%=rs.getString("event_name") %></td>
                                            <td><%=rs.getString("event_date") %></td>
                                            <td><%=rs.getString("event_desc") %></td>
                                            
                                        </tr>
                                     <%} %>
                                      
                                    </tbody>
                                </table>
                                    
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
