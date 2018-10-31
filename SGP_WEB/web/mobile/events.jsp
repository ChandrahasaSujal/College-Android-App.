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
	<h1>Events</h1>
</div>
<!--/.content-->
<div class="content">
<h2 style="color: green">Current Events</h2>
<table border=1 cellspacing=0 cellpadding=0>
<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>
<%
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//get current date time with Date()
Date date = new Date();


Connection con= DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date='"+dateFormat.format(date)+"' order by event_date desc");
while(rs.next())
{
%>
<tr><td><%=rs.getString("event_name")%></td><td><%=rs.getString("event_date")%></td><td><%=rs.getString("event_desc")%></td></tr>
<%} %>
</table>	<br/>

<h2 style="color: green">Future Events</h2>
<table border=1 cellspacing=0 cellpadding=0>
<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>
<%
Statement st2 = con.createStatement();
ResultSet rs2 = st2.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date>'"+dateFormat.format(date)+"' order by event_date desc");
while(rs2.next())
{
%>
<tr><td><%=rs2.getString("event_name")%></td><td><%=rs2.getString("event_date")%></td><td><%=rs2.getString("event_desc")%></td></tr>
<%} %>
</table>	<br/><br/>
<h2 style="color: green">Past Events</h2>

<table border=1 cellspacing=0 cellpadding=0>
<tr><td>Event&nbsp;Name</td><td>Event&nbsp;Date</td><td>Description</td></tr>
<%


Statement st1 = con.createStatement();
ResultSet rs1 = st.executeQuery("select event_id, event_name, event_date, event_desc from event where event_date<'"+dateFormat.format(date)+"' order by event_date desc");
while(rs1.next())
{
%>
<tr><td><%=rs1.getString("event_name")%></td><td><%=rs1.getString("event_date")%></td><td><%=rs1.getString("event_desc")%></td></tr>
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