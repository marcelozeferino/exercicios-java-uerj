<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



	
	<html>
	<%@page import="java.util.Calendar"%>
	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Curso extensão UERJ :: Aula09</title>
		<h2>Extensão em Java: Aula09 </h2>
		
	</head>
 	<body>

		<br/>
		
		<%-- AM or PM --%> 
		
		<!-- Declaracao  -->
		<%! int time = Calendar.getInstance().get(Calendar.AM_PM);  %> 
		
		<!--  Scriplet --> 
		<% if (time == Calendar.AM) {%>  	
			<h2> Bom dia </h2> 	
		<%} else { 	%>
		 	<h2> Boa tarde </h2> 	
		 <% } %>  
		 
		 <br>
		 
		 <!--  Expressoes  -->
		 Hora: <%= Calendar.getInstance().getTime() %>
		 
		 
		 <a href="validacaoCPF.jsp">Validacao CPF</a>
		 
	</body>
	
</html>