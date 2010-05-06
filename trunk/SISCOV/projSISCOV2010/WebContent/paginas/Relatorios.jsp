<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>
<title>SISCOV-WEB [ RELATÓRIOS ]</title>
<script language='JavaScript'> 
	function validaForm(){
	
		d = document.cadastro;
		if (d.login.value == ''){
			alert('O campo ' + d.login.name + ' deve ser preenchido!');
			d.login.focus();
			return false;
		}
			return true;
	}
</script>
<style type='text/css'>
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
<form name='Relatorios' action='Controladora' method='post' onSubmit='return validaForm()'>
  <div align='center'><span class='style1'>RELAT&Oacute;RIOS</span>
  </div>
  <table  align='center'width='598' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
		  <td width='115' bgcolor='#F7F7F7'><div align='center'><strong>Login</strong></div></td> 
		    <td width='312'><input name='login' type='text' size='25' maxlength='25'></td> 
		  	<td width='141'><input type='submit' name='consultalogin' value='Consultar'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><div align='center'><strong>Tipo de Ocorr&ecirc;ncia </strong></div></td> 
			<td>
				<select name='select'>
				  <option>Relat&oacute;rio de Tempo de Chamado Aberto </option>
				  <option>Relat&oacute;rio de Incid&ecirc;ncia de Chamado por usu&aacute;rio </option>
				  <option>Relat&oacute;rio de Chamados Abertos </option>
				  <option>Relat&oacute;rio de Chamados Fechados </option>
				  <option>Relat&oacute;rio de Chamado por &Aacute;rea T&eacute;cnica </option>
			    </select>
			</td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><div align='center'><strong>Per&iacute;odo: </strong></div></td> 
			<td>
				<input type='text' name='dataini' size='10'>
	          	At&eacute;
	          	<input type='text' name='datafinal' size='10'>
			</td> 
		</tr> 
		<tr> 
			<td colspan='2'>
			  <div align='center'>
			    <input type='submit' name='Submit' value='Visualizar'>
			    <input type='submit' name='Limpar' value='Imprimir'>
			    <input type='submit' name='Voltar' value='Voltar'>
			    <input type='reset' name='Limpar' value='Limpar'>
			  </div>
			</td> 
		</tr> 
  </table> 
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
