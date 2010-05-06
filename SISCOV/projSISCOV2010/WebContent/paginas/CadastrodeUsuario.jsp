<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="usuario.Usuario"%>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE USUÁRIO ]</title>
<script language="JavaScript"> 
	function validaForm(){
	
		d = document.cadastrodeUsuario;
		if (d.nome.value == ""){
			alert("O campo " + d.nome.name + " deve ser preenchido!");
			d.nome.focus();
			return false;
		}
			if (d.login.value == ""){
			alert("O campo " + d.login.name + " deve ser preenchido!");
			d.login.focus();
			return false;
		}
			
			if (d.matricula.value == ""){
			alert("O campo " + d.matricula.name + " deve ser preenchido!");
			d.matricula.focus();
			return false;
		}
			
				
	
		if (d.senha.value == ""){
			alert("O campo " + d.senha.name + " deve ser preenchido!");
			d.senha.focus();
			return false;
		}
			if (d.email.value == ""){
			alert("O campo " + d.email.name + " deve ser preenchido!");
			d.email.focus();
			return false;
		}
		//validar email(verificao de endereco eletronico)
		parte1 = d.email.value.indexOf("@");
		parte2 = d.email.value.indexOf(".");
		parte3 = d.email.value.length;
		if (!(parte1 > 1 && parte2 >= 6 && parte3 >= 9)) {
			alert("O campo " + d.email.name + " deve ser conter um endereco eletronico!");
			d.email.focus();
			return false;
		}
		 	if (d.cargo.value == ""){
			alert("O campo " + d.cargo.name + " deve ser preenchido!");
			d.cargo.focus();
			return false;
		}
			if (d.endereco.value == ""){
			alert("O campo " + d.endereco.name + " deve ser preenchido!");
			d.endereco.focus();
			return false;
		}
			if (d.cidade.value == ""){
			alert("O campo " + d.cidade.name + " deve ser preenchido!");
			d.cidade.focus();
			return false;
		}
	
			
		if (d.telefone.value == ""){
			alert("O campo " + d.telefone.name + " deve ser preenchido!");
			d.telefone.focus();
			return false;
		}
		
		if (isNaN(d.telefone.value)){
			alert("O campo " + d.telefone.name + " deve conter apenas numeros!");
			d.telefone.focus();
			return false;
		}
			
		d = document.cadastro;
		if (d.cargo.value == ""){
			alert("O campo " + d.cargo.name + " deve ser preenchido!");
			d.cargo.focus();
			return false;
		}
		if (!d.tipoacesso[0].checked && !d.tipoacesso[1].checked) {
			alert("Escolha o Tipo de Acesso");
			return false;
		}
		return true;
	}
	
		
	function alteraValorOperacao(){
	
			if("Alterar"){
				form.operacao.value = "2";
			}
			
			if("Cadastrar"){
				form.operacao.value = "3"; 
			}
			
			if("Excluir"){
				form.operacao.value = "4";
			}
			
			if("Voltar"){
				form.operacao.valeu = "6";
			}
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
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CADASTRO DE USUÁRIO</span>  </div>
  
  
  
  
  
<form name='cadastrodeUsuario'  action='ControladoraUsuario' method='post'  onSubmit='return validaForm()'>

		
			   <table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000' style='height: 147px; width: 547px'> 
					<tr> 
						<td width='127' bgcolor='#F7F7F7'><strong>Matricula:</strong></td> 
					    <td width='281'><input name='consmatricula' type='text' size='10' maxlength='10'></td> 
					</tr>
					<tr>
						<td bgcolor='#F7F7F7' style='width: 106px'><strong>Nome:</strong></td> 
						<td><input name='consultanome'  size='35' maxlength='35'></td> 
						<td width='70' style='width: 81px'><input type='submit' name='consultanome' value='Pesquisar'></td>
					</tr>
					<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Usuario usuario = new Usuario();
										Vector vectorDeNomes = usuario.listarUsuario();
										
										for(int i=0 ; i<vectorDeNomes.size() ; i++){ %>
											<option><%=vectorDeNomes.get(i)%></option>
									 	<%}--%>
									
							</select>
						</td>
					</tr>
			</table> 
			<hr color='#CCCCCC'>

	<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
			<tr> 
				<td width='126' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
			  <td width='362'><input name='nome' type='text' size='35' maxlength='35'></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Login:</strong></td> 
				<td><input name='login' type='text' size='10' maxlength='10'></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Matricula:</strong></td> 
				<td><input name='matricula' type='text' size='10' maxlength='10'></td> 
			</tr>
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Senha:</strong></td> 
				<td><input name='senha' type='text' size='10' maxlength='10'></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Email:</strong></td> 
				<td><input name='email' type='text' size='30' maxlength='30'> </td> 
			</tr> 
			
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Cargo</strong></td> 
				<td><input name='cargo' type='text' size='25' maxlength='25'></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Endere&ccedil;o</strong></td> 
				<td><label><input name='endereco' type='text' size='40' maxlength='40'></label>	</td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Cidade</strong></td> 
				<td><input name='cidade' type='text' size='20' maxlength='20'></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Telefone</strong></td> 
				<td><input name='telefone' type='text' size='13' maxlength='13'>(Apenas n&uacute;meros) </td>
			</tr> 
			<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Acesso</strong> </td> 
				<td>
					<input name='tipoacesso[]' type='radio' value='adminstrador' id='tipoacesso'> Administrador
					<input name='tipoacesso[]' type='radio' value='usuario' id='tipoacesso'> Usuário
				</td> 
			</tr> 
			<tr> 
				<td colspan='2'>
				  	<div align='center'>
					    <input type='submit' name='Cadastrar' value='Cadastrar' onclick='alteraValorOperacao();'>
		  			    <input type='submit' name='Alterar' value='Alterar' onclick='alteraValorOperacao();'>
					    <input type='reset' name='Limpar' value='Limpar'>
					    <input type='submit' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
					    <input type='submit' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
			      	</div>
				</td> 
			</tr> 
	
	  </table> 

		<input type='hidden' name='operacao' >
		<input type='hidden' name='formulario' value='cadastrodeusuario'>

</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
