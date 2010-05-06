<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Login ]</title>

<script language="JavaScript"> 
	function validaForm(){
	
		d = document.Login;
		if (d.login.value == ""){
			alert("O campo " + d.login.name + " deve ser preenchido!");
			d.login.focus();
			return false;
		}
			if (d.senha.value == ""){
			alert("O campo " + d.senha.name + " deve ser preenchido!");
			d.senha.focus();
			return false;
		}
			return true;
	}
	
	
	
	
	
</script>
<style type="text/css">
<!--
.style1 {
	font-size: 24px;
	font-weight: bold;
	color: #24A6B4;
}
-->
</style>
</head>

<body>
<div align='center'>
  <p><img src='paginas/imagens/topo.jpg' width='800' height='120'></p>
</div>

<form name='Login' action='login.ControladoraLogin' method='post' onSubmit='return validaForm();'>
			<%!String mensagem ;  %>
			<%=  (request.getParameter("mensagem") == null) ?  (mensagem = null)  : (mensagem = request.getParameter("mensagem"))%>
			
		<table  align='center'width='598' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
				<tr> 
					<td width='124' bgcolor='#F7F7F7'><div align='center'><strong>Login</strong></div></td> 
				    <td width='454'><div align='left'><input type='text' name='login' size='25'></div></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><div align='center'><strong>Senha:</strong></div></td> 
					<td><div align='left'><input type='password' name='senha' size='25'></div></td> 
				</tr> 
				<tr> 
					<td colspan='2'>
							  <div align='center'>
							    <input type='submit' name='Submit' value='Entrar'>
							    <input type='reset' name='Limpar' value='Limpar'>
						      </div>
					</td> 
				</tr> 
		  </table> 

		<input type='hidden' name='formulario' value='login'>
		<input type='hidden' name='operacao' value='0'>
</form>
<br><br>

<div align='center'>PAMO - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
