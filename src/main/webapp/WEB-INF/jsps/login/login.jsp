<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
    <h2>Login Here</h2>
    ${error}
  <form action="verifyLogin" method="post">
    <pre>
    email id <input type="text" name="emailId"/><br>
    password <input type="password" name="password"/><br>
             <input type="submit" value="login"/>
     </pre>
   
  </form>

</body>
</html>