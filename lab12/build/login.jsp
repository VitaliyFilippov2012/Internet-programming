<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>FORM login</title>
</head>
<body>
<br>
<h2>Form</h2>
<form method="post" action="j_security_check">
  <h2>Username</h2>
  <br>
  <label>
    <input type="text" name="j_username"/>
  </label>
  <br>
  <h2>Password</h2>
  <br>
  <label>
    <input type="password" name="j_password"/>
  </label>
  <br>
  <input type="submit"/>
</form>
</body>
</html>
