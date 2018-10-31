<!DOCTYPE html>
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
                           Add New Subject
                        </div>
                        <div class="panel-body">
                        
                            <div class="row">
                                <div class="col-lg-6">
                                <form action="internal_marks1.jsp">
                                <table>
                                <tr style="height: 50px"><td>Department</td><td><select name='department' id='department'>
                                	<option value='COMPUTER SCIENCE'>COMPUTER SCIENCE</option>
                                	<option value='ELECTRONICS & COMMUNICATION'>ELECTRONICS & COMMUNICATION</option>
                                	<option value='ELECTRICAL & ELECTRONICS ENGG'>ELECTRICAL & ELECTRONICS ENGG</option>
                                	<option value='MECHANICAL'>MECHANICAL</option>
                                	<option value='METALLURGY'>METALLURGY</option>
                                	<option value='CIVIL ENGG'>CIVIL ENGG</option>
                                </select></td></tr>
                                 <tr style="height: 50px"><td>Sem</td><td><select name='sem' id='sem'>
                                	<option value='SEM 1'>SEM 1</option>
                                	<option value='SEM 2'>SEM 2</option>
                                	<option value='SEM 3'>SEM 3</option>
                                	<option value='SEM 4'>SEM 4</option>
                                	<option value='SEM 5'>SEM 5</option>
                                	<option value='SEM 6'>SEM 6</option>
                                </select></td></tr>
                                <tr style="height: 50px"><td>Internal</td><td><select name='internal' id='internal'>
                                	<option value='1'>1</option>
                                	<option value='2'>2</option>
                                	<option value='3'>3</option>
                                	
                                </select></td></tr>
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
