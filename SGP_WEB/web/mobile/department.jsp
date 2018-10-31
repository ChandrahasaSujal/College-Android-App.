<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
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
	<h1>Departments</h1>
</div>
<!--/.content-->
<div class="content">

<table border=1 cellspacing=0 cellpadding=0>
<tr><td>Department&nbsp;Name</td></tr>
<%


Connection con= DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select distinct(department) as department from faculty order by department asc");
while(rs.next())
{
%>
<tr><td><%=rs.getString("department")%></td></tr>
<%} %>
</table>	<br/>


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