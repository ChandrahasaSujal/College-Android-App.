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
String fname=request.getParameter("fname");
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");

Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
st.execute("update faculty set login_name='"+name+"', pwd='"+pwd+"' where faculty_id='"+fname+"'");
response.sendRedirect("faculty_account.jsp?ststus='Successfully Created Account'");
%>
</body>
</html>