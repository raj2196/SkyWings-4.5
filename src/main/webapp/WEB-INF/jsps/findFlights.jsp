<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search flights</title>
</head>
<body>
   <h2>Find Flights</h2>
   <form action="findFlights" method="post">
        <pre>
              from:<input type="text" name="from"/><br>
                to:<input type="text" name="to"/><br>
    departure date:<input type="text" name="departureDate"/><br>
                   <input type="submit" value="search"/>
           </pre>
   </form>

</body>
</html>