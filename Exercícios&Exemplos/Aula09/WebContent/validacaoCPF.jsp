<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Validação de CPF</title>
	
	
</head>
<body>

	<jsp:useBean id="bean" class="br.com.uerj.bean.TesteBean" />
 
   
	<h2>Validação de CPF</h2>
	 
	<form md="POST" action="resultado.jsp"> 
	<table>
		<tr>
			<h4>Cpf: <input type="text" name="cpf" value="" /> </h4>
		</tr>
		<tr> 
			<input type="submit" value="Testar"/>
		</tr>
	</table>
	</form>
	
	
</body>
</html>