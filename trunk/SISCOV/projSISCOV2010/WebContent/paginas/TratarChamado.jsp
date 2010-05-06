<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>
<title>SISCOV-WEB [ TRATAR CHAMADO ]</title>

<style type='text/css'>
<!--
.style1 {
	font-size: 24px;
	font-weight: bold;
	color: #24A6B4;
}
-->
</style>


	<script type="text/javascript">
			function alteraValorOperacao(){
				if('Editar'){
					form.editar.value = 
				}
				if(){
				
				}
				if(){
				
				}
			}
	</script>

</head>

<body>
<div align='center'>
  <p><img src='imagens/topo.jpg' width='800' height='120'></p>
  <p><span class='style1'>TRATAR CHAMADO</span></p>
</div>
<form name='TratarChamado' action='Controladora' method='post' onSubmit='return validaForm()'>
		
		
  
  <table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='133' bgcolor='#F7F7F7'><strong>Chamado: </strong></td> 
		    <td width='355'><input name='chamdo' type='text' size='15' maxlength='10'></td> 
		</tr>
		<tr> 
			<td width='134' bgcolor='#F7F7F7'><strong>NEPAT</strong></td> 
		    <td width='354'><input name='nepat' type='text' size='15' maxlength='15'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Usu&aacute;rio:</strong></td> 
		    <td><input name='usuario' type='text' value='' size='30'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Login: </strong></td> 
			<td><input name='login' type='text' size='30'></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Status:</strong></td> 
			<td><input name='status' type='text' size='30' maxlength='30'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Suporte </strong></td> 
			<td><input name='tsuporte' type='text' size='30' maxlength='30'></td> 
		</tr> 
		
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Severidade:</strong></td> 
			<td><input name='severidade' type='text' size='30'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Problema::</strong></td> 
			<td><textarea name='problema' cols='35' rows='3'></textarea></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Diagn&oacute;stico:</strong></td> 
			<td><textarea name='diagnostico' cols='35' rows='3'></textarea></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Solu&ccedil;&atilde;o:</strong></td> 
			<td><textarea name='solucao' cols='35' rows='3'></textarea></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Observa&ccedil;&otilde;es:</strong></td> 
			<td><textarea name='observacoes' cols='40' rows='3'></textarea></td> 
		</tr>
		<tr> 
			<td colspan='2'>
			  <div align='center'>
			    <input type='submit' name='editar' value='Editar'>
			    <input type='submit' name='confirmar' value='Confirmar'>
			    <input type='submit' name='Voltar' value='Voltar'>
		      </div>
			</td> 
		</tr> 
  </table> 
  
  <input type='hidden' name='operacao' value=''>
  <input type='hidden' name='formulario' value='tratarchamado'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

