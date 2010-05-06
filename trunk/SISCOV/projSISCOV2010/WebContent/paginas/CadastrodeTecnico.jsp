<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="tecnico.ControladoraTecnico"%>
<%@page import="tecnico.Tecnico"%>
<%@page import="tecnico.TecnicoDAO"%>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE LIVRO ]</title>
<script language="JavaScript"> 
	function validaForm(Form){
	
		d = document.CadastrodeTecnico;
			if (d.matricula.value == ""){
			alert("O campo " + d.matricula.name + " deve ser preenchido!");
			d.matricula.focus();
			return false;
		}
			if (isNaN(d.matricula.value)){
			alert("O campo " + d.matricula.name + " deve conter apenas numeros!");
			d.matricula.focus();
			return false;
			}
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
		if (d.tsuporte.value == ""){
			alert("O campo " + d.tsuporte.name + " deve ser preenchido!");
			d.tsuporte.focus();
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
  <p><img src='imagens/topo.jpg' width='800' height='120'></p>
  <p><span class='style1'>CADASTRO DE T&Eacute;CNICO </span></p>
</div>
<form name='cadastrodeTecnico'  action='Controladora' method='post'  onSubmit='return validaForm()'>
  <table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'>
    <tr>
      <td width='175' bgcolor='#F7F7F7'><strong>Matricula:</strong></td>
      <td width='233'><input name='consnserie' type='text' size='10' maxlength='10'> </td>
      <td width='70'><input type='submit' name='consultanome' value='Pesquisar'></td>
    </tr>
    <tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Tecnico tecnico = new Tecnico();
										Vector vectorDeNomes = Tecnico.listarTecnico();
										
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
			<td width='174' bgcolor='#F7F7F7'><strong>Matricula:</strong></td> 
		    <td width='314'><input name='matricula' type='text' size='10' maxlength='10'>
		  <label></label></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
		    <td><input name='nome' type='text' size='30' maxlength='30'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Login:</strong></td> 
			<td><label><input name='login' type='text' size='10' maxlength='10'></label></td>
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Senha:</strong></td> 
			<td><label><input name='senha' type='text' size='10' maxlength='10'></label></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Suporte </strong></td> 
		  <td>
			  	<label>
			    	<select name='tdesuporte'>
			      		<option>Escolha o Tipo de Suporte</option>
		        	</select>
			  	</label>
		  </td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Telefone:</strong></td> 
		  	<td><label><input name='telefone' type='text' size='13' maxlength='13'>(Apenas n&uacute;meros) </label></td> 
		</tr> 
		<tr> 
			<td colspan='2'>
				  <div align='center'>
					    <input type='submit' name='Submit' value='Cadastrar' onclick='alteraValorOperacao();'>
					    <input type='reset' name='Limpar' value='Limpar'>
					    <input type='submit' name='Submit' value='Alterar' onclick='alteraValorOperacao();'>
					    <input type='submit' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
					    <input type='submit' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
			      </div>
			</td> 
		</tr> 
  </table> 

		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value=''>  
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

