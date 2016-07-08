<html>
<head>
<script type="text/javascript">
function validateStudentDetails() {
	var emailAddress = document.getElementById("email").value;
	if(validEmail(emailAddress)) {
		zipcode_validate();	
	} else {
		alert ("Please enter valid email address!");
	}
}

//Validates email address.
function validEmail(e) {
    var filter = /^\s*[\w\-\+_]+(\.[\w\-\+_]+)*\@[\w\-\+_]+\.[\w\-\+_]+(\.[\w\-\+_]+)*\s*$/;
    return String(e).search (filter) != -1;
}

//Vaidates zipcode.
function zipcode_validate()
{

var zipcode = document.getElementById("zip").value;
var regZipcode = /^([0-9]){5}(([ ]|[-])?([0-9]){4})?$/;

if(regZipcode.test(zipcode) == false)
{

	alert ("Enter a valid zipcode!");

}
else
{
	document.registerForm.submit();

}
}
</script>

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
	<h1 align="center">Student Registration Portal</h1>
	<br></br>
	<form action="register.do" method="post" name="registerForm" id="container">
		<table>
			<tr class="line">
				<td >Please Enter Student First Name : </td>
				<td><input type="text"
					name="firstName" id="firstName">
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Please Enter Student Last Name : </td><td><input type="text"
					name="lastName" id="lastName">
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Please Enter Student Password :</td><td> <input type="password"
					name="password" id="password">
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Please Enter Student Email Address :</td><td> <input type="text"
					name="email" id="email">
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Please Enter Student City : </td><td><input type="text" name="city"
					id="city">
				</td>
			</tr>
<tr></tr>
			<tr class="line">
				<td>Please Enter Student Zip :</td><td> <input type="text" name="zip"
					id="zip">
				</td>
			</tr>
		</table>
		<br></br>
		<div align="center">
				<input type="button" value="Register"  onclick="validateStudentDetails();">
		</div>
	</form>
</body>
</html>
