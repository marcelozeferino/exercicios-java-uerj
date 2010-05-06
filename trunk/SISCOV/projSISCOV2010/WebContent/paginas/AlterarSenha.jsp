<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Alterar Senha ]</title>
<script language="JavaScript"> 
	function validaForm(){
	
		d = document.cadastro;
		if (d.senhaatual.value == ""){
			alert("O campo " + d.senhaatual.name + " deve ser preenchido!");
			d.senhaatual.focus();
			return false;
		}
			if (d.novasenha.value == ""){
			alert("O campo " + d.novasenha.name + " deve ser preenchido!");
			d.novasenha.focus();
			return false;
		}
			if (d.cnovasenha.value == ""){
			alert("O campo " + d.cnovasenha.name + " deve ser preenchido!");
			d.cnovasenha.focus();
			return false;
		}
			
		if (d.novasenha.value == d.cnovasenha.value){
			alert("Senha alterada com sucesso");
			d.cnovasenha.focus();}
			else {alert("Senhas não Coinsidem");
			d.cnovasenha.focus();
		}
			
		return true;
	}
	
	
	
	function alteraValorOperacao(){
	
		if("Alterar"){
			form.operacao.value = "2";
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
</div>
<form name='AlterarSenha'  action='Controladora' method='post'  onSubmit='return validaForm()'>
  <div align='center'><span class='style1'>Alterar Senha </span>  </div>
  <table  align='center'width='598' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='124' bgcolor='#F7F7F7'><div align='center'><strong>Senha Atual:</strong></div></td> 
		    <td width='454'><label><input type='password' name='senhaatual' size='25' maxlength='25'></label></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><div align='center'><strong>Nova Senha: </strong></div></td> 
			<td><label><input type='password' name='novasenha' size='25' maxlength='25'></label></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><div align='center'><strong>Confirmar Senha : </strong></div></td> 
			<td><label><input type='password' name='cnovasenha' size='25' maxlength='25'></label></td> 
		</tr> 
		<tr> 
			<td colspan='2'>
					  <div align='center'>
					    <input type='submit' name='Submit' value='Alterar' onclick='alteraValorOperacao();'>
					    <input type='reset' name='Limpar' value='Limpar' onclick='alteraValorOperacao();'>
				        <input type='submit' name='Voltar' value='Voltar'>
					  </div>
			</td> 
		</tr> 
  </table> 
  		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='alterarsenha'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
