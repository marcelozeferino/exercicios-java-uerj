<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da Busca</title>
        
        <jsp:useBean id="bean" scope="request" class="br.com.uerj.bean.TesteBean" />
        
	<jsp:setProperty name="bean" property="*" />
    </head>
    <body>
    	<h2>CPF: </h2>
    	<jsp:getProperty name="bean" property="cpf" />
    	
    	<% bean.validar(); %>
    	
        <h2>Resultado da Validacao: </h2> 
        <jsp:getProperty name="bean" property="mensagem" />
        
        
        <p><a href="validacaoCPF.jsp">Voltar</a></p>
    </body>
</html>
