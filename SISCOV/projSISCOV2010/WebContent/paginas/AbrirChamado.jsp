<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Abrir Chamado ]</title>
<script language="JavaScript"> 
	function validaForm(){
	
		d = document.cadastro;
		if (d.problema.value == ""){
			alert("O campo " + d.problema.name + " deve ser preenchido!");
			d.problema.focus();
			return false;
		}
			if (d.nepat.value == ""){
			alert("O campo " + d.nepat.name + " deve ser preenchido!");
			d.nepat.focus();
			return false;
		}
			return true;
	}
	
	
	
	function alteraValorOperacao(){
				if("Abrir Chamado"){
					AbrirChamado.operacao.value = "3"; 
				}
				if("Voltar"){
					AbrirChamado.operacao.valeu = "6";
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
<form name='AbrirChamado'  action='Controladora' method='post' onSubmit='return validaForm()'>
  <div align='center'><span class='style1'>ABRIR CHAMADO </span>  </div>
  <table  align='center'width='796' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
		  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Problema</strong>:</div></td> 
		    <td width='655'><label>
		    <textarea name='problema' cols='60' rows='3'></textarea>
		    </label></td> 
		</tr> 
		<tr> 
		  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Nepat:</strong></div></td> 
		  <td width='655'><label><input name='nepat' type='text' value='' size='10' maxlength='10'></label></td> 
		</tr> 
		<tr> 
		  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Tipo de Suporte: </strong></div></td> 
		    <td width='655'>
		    	<label>
		    		<select name='tiposuporte'>
		      			<option>Escolha o Tipo de Suporte</option>
	        		</select>
		    	</label>
		    </td> 
		</tr> 
		<tr> 
			<td colspan='2'>
					<div align='center'>
					    <input type='submit' name='Submit' value='Abrir Chamado' onclick='alteraValorOperacao();'>
					    <input type='reset' name='Limpar' value='Limpar' onclick='alteraValorOperacao();'>
			        	<input type='submit' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
		        	</div>
			</td>
		</tr> 
  </table> 
  
  		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='abrirchamado'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
