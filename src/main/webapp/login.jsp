<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validateLogin() {
	var emailAddress = document.getElementById("email").value;
	if(validEmail(emailAddress)) {
		validEmptyPassword();
		
	} else {
		alert ("Please enter valid email address!")
	}
}

//Validates email address of course.
function validEmail(e) {
    var filter = /^\s*[\w\-\+_]+(\.[\w\-\+_]+)*\@[\w\-\+_]+\.[\w\-\+_]+(\.[\w\-\+_]+)*\s*$/;
    return String(e).search (filter) != -1;
}


//Validate password
function validEmptyPassword() {
	
    var password = document.getElementById("password").value;
    
    if(password == "")
    	{
    	alert("Password cannot be empty");
    	}
    else{
    	document.loginForm.submit();
    	
    }
}
</script>
<style type="text/css">
 
            body {font-family:Arial, Sans-Serif;}
 
            #container {width:700px; margin:0 auto;}
 
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
<h1 align="center">Student Login Portal </h1>
<br></br>
	<form action="login.do" method="post" name="loginForm">
		<table align="center">
			<tr class="line">
				<td>Please Enter Student Email Address : </td><td><input type="text"
					name="email" id="email">
				</td>
			</tr>

			<tr class="line">
				<td>Please Enter Student Password :</td><td> <input type="password"
					name="password" id="password">
				</td>
			</tr>
		</table>
		<br></br>
		<div align="center">
		<input type="button" value="Login" onclick="validateLogin();"></input>
	</div>
	<br></br>
	<div align="center">
				<a href="index.do">Register</a> 
		</div>
	</form>


</body>
</html>