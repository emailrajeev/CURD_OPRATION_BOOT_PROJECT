<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display_Location</title>
</head>
<body>
      <h2>Location</h2>
      <table border="2">
      	<tr>
      	 <th>Id</th>
      	 <th>Code</th>
      	 <th>Name</th>
      	 <th>Type</th>
      	 
      </tr>
      <c:forEach items="${locations}" var="location">
      <tr>
      
      		<th>${location.id}</th>
      		 <th>${location.code}</th>
      		<th>${location.name}</th>
      		<th>${location.type}</th> 
      		<th><a href="deleteLocation?id=${location.id}">Delete</a></th>
      		<th><a href="showUpdate?id=${location.id}">Edit</a></th>
      </tr>      
      </c:forEach>
      </table>		
              <h2><a href="showCreate">AddLocation</a></h2>
</body>
</html>