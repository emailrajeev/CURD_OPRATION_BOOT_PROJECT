<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LocationTITL</title>
</head>
<body>
<pre>
<form action="saveloc" method="post">

   Id:<input type="text" name="id"/>
   Code<input type="text" name="code"/>
   Name<input type="text" name="name"/>
   Type:Urben<input type="checkbox" name="type" value="Urben"/>
   Ruler<input type="checkbox" name="type" value="Ruler"/>
   	<input type="submit" value="Save"/>
   	
</form>
${msg}
</pre>
<a href="displayLocation">View All</a>
</body>
</html>