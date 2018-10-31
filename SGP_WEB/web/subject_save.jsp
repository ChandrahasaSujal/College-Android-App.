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
String subject=request.getParameter("subject");
String subject_type=request.getParameter("subject_type");

Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
st.execute("insert into subjects(subject_id, dept, sem, subject_name, subject_type)values('0','"+dept+"','"+sem+"','"+subject+"','"+subject_type+"')");
response.sendRedirect("subject_new.jsp?ststus='Successfully Added New Subject'");
%>
</body>
</html>