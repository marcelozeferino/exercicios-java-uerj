<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" isErrorPage="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title> SISCOV - WEB [ PAGINA DE ERRO ]</title>
</head>



<body>
	<div align="center">
		  	<p><img src='imagens/topo.jpg' width='800' height='120' /></p>
		  
			
			<h1><font color='red'><i>Erro:</i></font></h1>
			<h3><%= request.getParameter("mensagem") %></h3>
			
			PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br/>
		 	 Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 
 	</div>

</body>
</html>