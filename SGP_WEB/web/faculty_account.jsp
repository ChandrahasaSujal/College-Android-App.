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
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Add New Faculty
                        </div>
                        <div class="panel-body">
                        
                            <div class="row">
                                <div class="col-lg-6">
                                <form action="faculty_account_save.jsp">
                                <table>
                                <tr style="height: 50px"><td>Faculty Name</td><td><select name='fname' id='fname'>
                                <option value=''></option>
                                <%
                                Connection con = DBConnectivity.getCon();
                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery("select faculty_id,name from faculty");
                                while(rs.next())
                                {
                                %>
                            	<option value='<%=rs.getString("faculty_id")%>'><%=rs.getString("name")%></option>
                            	<%} %>
                                </select></td></tr>
                                <tr style="height: 50px"><td>Login Name</td><td><input type='text' name='name' id='name'>
                                <tr style="height: 50px"><td>Password</td><td><input type='text' name='pwd' id='pwd'>
                                 
                                <tr><td></td><td><input type='submit' value='Save'></td></tr>
                                </table>
                                
                                </form>
                                
                                
                                    
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                  <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Name</th>
                                            <th>Login Name</th>
                                            <th>Pwd</th>
                                          
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <%
                                    Connection con1 = DBConnectivity.getCon();
                                    Statement st1 = con1.createStatement();
                                    ResultSet rs1 = st1.executeQuery("select faculty_id, name, login_name, pwd from faculty");
                                    while(rs1.next())
                                    {
                                    %>
                                        <tr class="odd gradeX">
                                            <td><%=rs1.getString("name") %></td>
                                            <td><%=rs1.getString("login_name") %></td>
                                            <td><%=rs1.getString("pwd") %></td>
                                           
                                        </tr>
                                     <%} %>
                                      
                                    </tbody>
                                </table>
                                
                                </div>
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
