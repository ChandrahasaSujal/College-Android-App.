<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<jsp:include page="include/title.jsp"></jsp:include>

<link href='http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css' rel='stylesheet'>
<link href='css/bootstrap_font.css' rel='stylesheet' type='text/css'>
<link href='css/font.css' rel='stylesheet' type='text/css'>
<link href='css/style.css' rel='stylesheet' type='text/css'>

</head>

<body>


<!--/.header-->
<div class="content yellow">
	<h1>Internals</h1>
</div>
<!--/.content-->
<div class="content">
<form action="">
<table>
<tr><td>Enter Student Id</td><td><input type='text' name='student_id' id='student_id'></td></tr>
 <tr style="height: 50px"><td>Sem</td><td><select name='sem' id='sem'>
                                	<option value='SEM 1'>SEM 1</option>
                                	<option value='SEM 2'>SEM 2</option>
                                	<option value='SEM 3'>SEM 3</option>
                                	<option value='SEM 4'>SEM 4</option>
                                	<option value='SEM 5'>SEM 5</option>
                                	<option value='SEM 6'>SEM 6</option>
                                </select></td></tr>
                                <tr><td></td><td><input type='submit' value="getResult"></td></tr>
</table>
</form>
<%if(request.getParameter("sem")!=null)
{ %>
<table border=1 cellspacing=0 cellpadding=0>
<tr><td>Subject</td><td>Marks Obtained</td></tr>
<%
Connection con2=DBConnectivity.getCon();
Statement st2=con2.createStatement();
String student_id="";
ResultSet rs2 = st2.executeQuery("select student_id from students where reg_no='"+request.getParameter("student_id")+"'");
while(rs2.next())
{
	student_id=rs2.getString("student_id");
}


Connection con= DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select marks_id, student_id, sem, internal, subject_id, marks_obtained from marks where student_id='"+student_id+"' and sem='"+request.getParameter("sem")+"'");
while(rs.next())
{
	String sub="";
	Statement st1 = con.createStatement();
	ResultSet rs1 = st1.executeQuery("select subject_name from subjects where subject_id='"+rs.getString("subject_id")+"'");
	while(rs1.next())
	{
		sub=rs1.getString("subject_name");
	}
	
%>
<tr><td><%=sub%></td><td><%=rs.getString("marks_obtained")%></td></tr>
<%} %>
</table>	
<%} %>
</div>

<!-------------------- JS -------------------->
<script src="js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('.slideout-menu-toggle').on('click', function(event){
    	event.preventDefault();
    	// create menu variables
    	var slideoutMenu = $('.slideout-menu');
    	var slideoutMenuWidth = $('.slideout-menu').width();
    	
    	// toggle open class
    	slideoutMenu.toggleClass("open");
    	
    	// slide menu
    	if (slideoutMenu.hasClass("open")) {
	    	slideoutMenu.animate({
		    	left: "0px"
	    	});	
    	} else {
	    	slideoutMenu.animate({
		    	left: -slideoutMenuWidth
	    	}, 250);	
    	}
    });
});
</script>
</body>
</html>