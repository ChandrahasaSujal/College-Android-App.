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

<!--/.content-->
<div class="content">

<iframe src="https://www.google.com/maps/embed?pb=!1m24!1m12!1m3!1d61617.38927746966!2d76.8751290965877!3d15.153575404528933!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m9!1i0!3e6!4m0!4m5!1s0x3bb713d05563bf0d%3A0xe98b678ac5881dda!2ssanjay+gandhi+polytechnic+bellary!3m2!1d15.153578!2d76.90946199999999!5e0!3m2!1sen!2sin!4v1425627047826" width="400" height="350" frameborder="0" style="border:0"></iframe>
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