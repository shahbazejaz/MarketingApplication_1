<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<h2>Please Enter Your Details</h2>
<body>
<form action="saveLead" method="post">
     <pre>
     FirstName<input type="text" name="firstName"/>
     LastName<input type="text" name="lastName"/>
     Email<input type="text" name="email"/>
     Mobile<input type="text" name="mobile"/>
     <input type="submit" value="save"/>
     </pre>
</form>
</body>
</html>