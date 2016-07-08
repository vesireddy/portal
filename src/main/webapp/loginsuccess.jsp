<%@page import="com.student.portal.vo.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login success</title>
<style type="text/css">
 
            body {font-family:Arial, Sans-Serif;}
 
            #container {width:400px; margin:0 auto;}
 
            /* Nicely lines up the labels. */
            form label {display:inline-block; width:140px;}
 
            /* You could add a class to all the input boxes instead, if you like. That would be safer, and more backwards-compatible */
            form input[type="text"],
            form input[type="password"],
            form input[type="email"] {width:100px;}
 
            form .line {clear:both;}
            form .line.submit {text-align:right;}
 
        </style>
</head>
<body bgcolor="#E6E6FA">
<% StudentVO studentVO = (StudentVO)session.getAttribute("STUDENT_DETAILS"); %>
	<div align="center">
	<h2>User <%=studentVO.getFirstName() %> Logged in successfully!Please find the student details below.</h2>
	</div>
	<br></br> 
	<form action="register.do" method="post" name="registerForm" id="container">
		<table>
			<tr class="line">
				<td > First Name : </td>
				<td>
				<%=studentVO.getFirstName() %>
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td> Last Name : </td><td><%=studentVO.getLastName() %>
				</td>
			</tr>

			<tr class="line">
				<td> Email Address :</td><td> <%=studentVO.getEmail() %>
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Student City : </td><td><%=studentVO.getCity() %>
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Student Zip :</td><td> <%=studentVO.getZip() %>
				</td>
			</tr>
		</table>
		<br></br>
		<div align="center">
				<a href="logout.do">Logout</a> 
		</div>
	</form>
</body>
</html>