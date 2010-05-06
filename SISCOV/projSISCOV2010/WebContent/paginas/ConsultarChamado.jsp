<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CONSULTAR CHAMADO ]</title>

<style type="text/css">
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
					if("Voltar"){
						form.operacao.valeu = "6";
					}
			}
</script>











</head>

<body>
<div align='center'>
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CONSULTAR CHAMADO </span></p>
</div>
<form name='ConsultarChamado'  action='Controladora' method='post'  onSubmit='return validaForm()'>
		<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
				<tr> 
					<td width='137' bgcolor='#F7F7F7'><strong>Chamado:</strong></td> 
				    <td width='269'><input name='nbo' type='text' size='15' maxlength='10'></td> 
				  	<td width='72'><input type='submit' name='Visualizar' value='Pesquisar'></td>
				</tr>
		  </table>
		  <hr color='#CCCCCC'>
		
		<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
				<tr> 
					<td width='134' bgcolor='#F7F7F7'><strong>T&eacute;cnico:</strong></td> 
				    <td width='354'><input name='Tecnico' type='text' size='30' maxlength='30'></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Problema :</strong></td> 
				    <td><textarea name='problema' cols='35' rows='3'></textarea></td>
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Tipo de Suporte: </strong></td> 
					<td><input name='tsuporte' type='text' size='30'></td> 
				</tr>
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Severidade</strong></td> 
					<td><input name='severidade' type='text' size='30' maxlength='30'></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Status:</strong></td> 
					<td><input name='status' type='text' size='20' maxlength='20'></td> 
				</tr> 
				
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Observa&ccedil;&otilde;es</strong></td> 
					<td><textarea name='observacoes' cols='35' rows='3'></textarea></td> 
				</tr> 
				<tr> 
					<td colspan='2'>
									<div align='center'> <input type='reset' name='Voltar' value='Voltar'></div>
					</td>
				</tr> 
		  </table> 
		  
		  <input type='hidden' name='operacao' value=''>
		  <input type='hidden' name='formulario' value='consultarchamado'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

