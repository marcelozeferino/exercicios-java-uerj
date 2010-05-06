<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Definir Suporte Atendimento ]</title>
<script language="JavaScript"> 
	function validaForm(Form){
	
		d = document.DefinirSuporteAtendimento;
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
		if (d.nepat.value == ""){
			alert("O campo " + d.nepat.name + " deve ser preenchido!");
			d.nepat.focus();
			return false;
		}
		if (d.problema.value == ""){
			alert("O campo " + d.problema.name + " deve ser preenchido!");
			d.problema.focus();
			return false;
		}
			if (d.tsuporte.value == ""){
			alert("O campo " + d.tsuporte.name + " deve ser preenchido!");
			d.tsuporte.focus();
			return false;
		}
			if (d.tecnico.value == ""){
			alert("O campo " + d.tecnico.name + " deve ser preenchido!");
			d.tecnico.focus();
			return false;
		}	if (d.severidade.value == ""){
			alert("O campo " + d.severidade.name + " deve ser preenchido!");
			d.severidade.focus();
			return false;
		}
		
			return true;
	}
	
	
	
	
	
	
function alteraValorOperacao(){
	
			if("Confirmar Chamado"){
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


<form name='DefinirSuporteAtendimento'  action='Controladora' method='post'  onSubmit='return validaForm()'>
	  <div align='center'><span class='style1'>Definir Suporte Atendimento </span>  </div>
	  <table  align='center'width='796' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Nome Usu&aacute;rio </strong></div></td> 
			    <td width='655'><input name='nome' type='text' value='' size='30' maxlength='30'></td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Login:</strong></div></td> 
			    <td width='655'><input name='login' type='text' value='' size='10' maxlength='10'></td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>NEPAT:</strong></div></td> 
			    <td width='655'><input name='nepat' type='text' size='10' maxlength='10'></td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Problema</strong>:</div></td> 
			    <td width='655'><textarea name='problema' cols='60' rows='3'></textarea></td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Tipo de Suporte:</strong></div></td> 
			    <td width='655'>
		        	<select name='Tsuporte'>
	              		<option>Escolha o Tipo de Suporte</option>
	                </select>
			    </td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>T&eacute;cnico:</strong></div></td> 
			    <td width='655'>
			    	<select name='tecnico'>
	                	<option>Escolha o T&eacute;cnico</option>
	              </select>
			    </td> 
			</tr> 
			<tr> 
			  <td width='121' bgcolor='#F7F7F7'><div align='center'><strong>Severidade::</strong></div></td> 
			    <td width='655'>
			      	<select name='severidade'>
		                <option>Normal</option>
		                <option>Critica</option>
	              	</select>
			    </td> 
			</tr> 
			<tr> 
				<td colspan='2'>
				  <div align='center'>
				    <input type='submit' name='Submit' value='Confirmar Chamado' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Limpar' value='Limpar'>
			        <input type='submit' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
			      </div>
				</td> 
			</tr> 
	  </table>
	  
		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='definirsuporteatendimento'>	   
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
