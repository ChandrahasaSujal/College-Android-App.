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
	<h1>CIVIL ENGG</h1>
</div>
<!--/.content-->
<div class="content">

<table>
<%
Connection con= DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from faculty where department='CIVIL ENGG'");
while(rs.next())
{
%>
<tr><td></td><td><%=rs.getString(2)%></td><td> ( <%=rs.getString("designation")%> )</td></tr>
<%} %>
</table>	
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