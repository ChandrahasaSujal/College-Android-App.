<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String event=request.getParameter("event");
String date=request.getParameter("date");
String desc=request.getParameter("desc");


Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
st.execute("insert into event(event_id, event_name, event_date, event_desc)values('0','"+event+"','"+date+"','"+desc+"')");
response.sendRedirect("event_new.jsp?ststus='Successfully Added New Event'");
%>
</body>
</html>