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
String dept=request.getParameter("department");
String sem=request.getParameter("sem");
String name=request.getParameter("name");
String reg_no=request.getParameter("reg_no");

Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
st.execute("insert into students(student_id, dept, sem, student_name, reg_no)values('0','"+dept+"','"+sem+"','"+name+"','"+reg_no+"')");
response.sendRedirect("student_new.jsp?ststus='Successfully Added New Subject'");
%>
</body>
</html>