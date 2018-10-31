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
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Form Elements
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <table><tr style="height: 40px"><td>Name of the applicant in Full <span style="font-size: 10px"><br/>(As recorded in Degree Marks Card) :</span></td><td><input type="text" name="fname"></input></td></tr>
<tr style="height: 40px"><td>Father /Guardian Name:</td><td><input type="text" name="mname"></input></td></tr>
<tr style="height: 40px"><td>Mother Name:</td><td><input type="text" name="lname"></input></td></tr>
<tr style="height: 40px"><td>Address for Communication:</td><td><textarea></textarea></td></tr>
<tr style="height: 40px"><td>Pin Code:</td><td><input type="text" name="pincode"></input></td></tr>
<tr style="height: 40px"><td>Email Id:</td><td><input type="text" name="email"></input></td></tr>
<tr style="height: 40px"><td>Phone No:</td><td><input type="text" name="phone"></input></td></tr>
<tr style="height: 40px"><td>Mobile No:</td><td><input type="text" name="mobile"></input></td></tr>

</table>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                    <table>

<tr style="height: 40px"><td>Gender:</td><td>Male:<input type="radio" name="gen">FeMale:<input type="radio" name="gen"></input></td></tr>

<tr><td>place and date of Birth:</td><td><input type="text" name="pname"></input></td></tr>
<tr><td>Father/Guardian Occupation and Annual Income:</td><td><input type="text" name="oname"></input></td></tr>
<tr><td>Nationality:</td><td><input type="text" name="nname"></input></td></tr>



<tr><td>Category:</td><td>
GM:<input type="radio" name="cat" value='GM'></input>
SC:<input type="radio" name="cat" value='SC'>
ST:<input type="radio" name="cat" value='ST'>
2A:<input type="radio" name="cat" value='2A'>
2B:<input type="radio" name="cat" value='2B'>
3A:<input type="radio" name="cat" value='3A'>
3B:<input type="radio" name="cat" value='3B'></td></tr>
<tr><td>Claiming Seat Under:</td><td>
Diff Abled:<input type="radio" name="cat" value='Diff Abled'>
NCC:<input type="radio" name="cat" value='NCC'>
NSS:<input type="radio" name="cat" value='NSS'>
Sports:<input type="radio" name="cat" value='Sports'>
Defence Personnel:<input type="radio" name="cat" value='Defence Personnel'>
Ex-servicemen:<input type="radio" name="cat" value='Ex-servicemen'>
OU:<input type="radio" name="cat" value='OU'></td>
OS:<input type="radio" name="cat" value='OS'></td></tr>
<tr><td>Name of the College last studied:</td><td><input type='text' name='college' size="40px"></td></tr>


</table>
                                </div>
                                
                                
                                <div class="col-lg-12">
                                <h5>Details of qualifying Examination:</h5>
                                <table><tr><td>Examination</td>
<td>University</td><td>Month and year</td><td>Max Marks</td><td>Percentage</td></tr></td>
<tr>
<td><input type='text' name='examination'></td>
<td><input type='text' name='universaty'></td>
<td><input type='text' name='month'></td>
<td><input type='text' name='max_marks'></td>
<td><input type='text' name='marksobtained'></td>
</tr>
<tr>
<td><input type='text' name='examination'></td>
<td><input type='text' name='universaty'></td>
<td><input type='text' name='month'></td>
<td><input type='text' name='max_marks'></td>
<td><input type='text' name='marksobtained'></td>
</tr>
</table>
<br/>
<h5>Details of marks obtained in all the optional subjects in qualifying degree examination:</h5>

<table border=1 cellspacing=0 cellpadding=0>
<tr>
	<th>Slno</th>
	<th>Subject</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;1st Sem&nbsp;<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;2nd Sem&nbsp;<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;3rd Sem<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;4th Sem<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;5th Sem<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;6th Sem<br/>&nbsp;&nbsp;MO&nbsp;&nbsp;&nbsp;|&nbsp;MM</th>
	<th>Total Marks</th>
<th>% of Marks</th></tr>

<%
for(int i=1;i<=3;i++)
{
%>
<tr>
<td><input type='text' size='3' value='<%=i%>'></td>
	<td><input type='text'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='2'><input type='text' size='2'></td>
	<td><input type='text' size='6'></td><td><input type='text' size='6'></td>
</tr>
<%} %>

<tr><td colspan="4">MO : Indicates Marks Obtained in the concerned subject/ paper<br/> along
with theory/ Practicals (wherever applicable )<br>
MM : Indicates Maximum Marks for the concerned subject/ paper<br/> along
with theory/ Practicals (wherever applicable) </td><td colspan="5">Aggregate Percentage of Marks of all the Semesters</td><td></td></tr>
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
