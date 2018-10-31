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
String name=request.getParameter("name");
String mobile=request.getParameter("mobile");
String email=request.getParameter("email");
String designation=request.getParameter("designation");
String department=request.getParameter("department");

Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
st.execute("insert into faculty(faculty_id, name, mobile, email, designation, department)values('0','"+name+"','"+mobile+"','"+email+"','"+designation+"','"+department+"')");
response.sendRedirect("faculty_new.jsp?ststus='Successfully Added New Faculty'");
%>
</body>
</html>