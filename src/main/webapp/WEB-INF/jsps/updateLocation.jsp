<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update_Location</title>
</head>
<body>
<pre>
<form action="upadteLoc" method="post">

   Id:<input type="text" name="id" value="${location.id}" readonly="readonly"/>
   Code<input type="text" name="code" value="${location.code}"/>
   Name<input type="text" name="name" value="${location.name}"/>
   Type:Urben<input type="checkbox" name="type" value="Urben" ${location.type='Urben'?'checked':''}/>
   Ruler<input type="checkbox" name="type" value="Ruler" ${location.type='Ruler'?'checked':''}/>
   	<input type="submit" value="Save"/>
   	
</form>
${msg}
</pre>
<a href="displayLocation">View All</a>
</body>
</html>