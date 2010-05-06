<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="suporte.ControladoraSuporte"%>
<%@page import="suporte.Area"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE Área Técnica]</title>
<script language="JavaScript"> 
	function validaForm(){
	
	
		d = document.ControledeAreaTecnica;
		if (d.nome.value == ""){
			alert("O campo " + d.nome.name + " deve ser preenchido!");
			d.nome.focus();
			return false;
		}
			
		
		if (d.tsuporte.value == ""){
			alert("O campo " + d.tsuporte.name + " deve ser preenchido!");
			d.tsuporte.focus();
			return false;
		}
		if (d.tatendimento.value == ""){
			alert("O campo " + d.tatendimento.name + " deve ser preenchido!");
			d.tatendimento.focus();
			return false;
		}
		if (d.comentario.value == ""){
			alert("O campo " + d.comentario.name + " deve ser preenchido!");
			d.comentario.focus();
			return false;
	
			}
		return true;
	}
	
	
	
	function alteraValorOperacao(){
	
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
  <p><span class='style1'>CADASTRO DE &Aacute;REA T&Eacute;CNICA </span></p>
</div>
<form name='ControledeAreaTecnica'  action='Controladora' method='post'  onSubmit='return validaForm()'>
  <table  align='center'width='585' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'>
    <tr>
      <td width='155' bgcolor='#F7F7F7'><strong>Nome:</strong></td>
      <td width='283'><input name='consnome' type='text' size='30' maxlength='30'></td>
      <td width='117'><input type='submit' name='consultanomearea' value='Pesquisar'></td>
    </tr>
    	<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Area area = new Area();
										Vector vectorDeNomes = area.listarArea();
										
										for(int i=0 ; i<vectorDeNomes.size() ; i++){ %>
											<option><%=vectorDeNomes.get(i)%></option>
									 	<%}--%>
									
							</select>
						</td>
		</tr>
  </table>
  <hr color='#CCCCCC'>

<table  align='center'width='582' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='152' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
		    <td width='410'><input name='nome' type='text' size='30' maxlength='30'></td> 
		  
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Suporte :</strong></td> 
		    <td><input type='text' name='tsuporte' size='30' maxlength='30'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Atendimento :</strong></td> 
			<td><input type='text' name='tatendimento' size='30' maxlength='30'></td>
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Coment&aacute;rio:</strong></td>
			<td><textarea name='comentario' cols='35' rows='3'></textarea></td>
		</tr> 
		<tr> 
			<td colspan='2'>
			  <div align='center'>
				    <input type='submit' name='Submit' value='Cadastrar' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Limpar' value='Limpar'>
				    <input type='reset' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
		      </div>
			</td> 
		</tr> 
  </table> 
  
  	<input type='hidden' name='operacao' value=''>
	<input type='hidden' name='formulario' value='cadastrodeareatecnica'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

