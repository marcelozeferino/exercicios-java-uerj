<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="software.ControladoraSoftware"%>
<%@page import="software.SoftwareDAO"%>
<%@page import="software.Software"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE LIVRO ]</title>
<script language="JavaScript"> 
	function validaForm(Form){
	
	
		d = document.cadastrodeSoftware;
		if (d.nome.value == ""){
			alert("O campo " + d.nome.name + " deve ser preenchido!");
			d.nome.focus();
			return false;
		}
		if (d.descricao.value == ""){
			alert("O campo " + d.descricao.name + " deve ser preenchido!");
			d.descricao.focus();
			return false;
		}
		if (d.quantidade.value == ""){
			alert("O campo " + d.quantidade.name + " deve ser preenchido!");
			d.quantidade.focus();
			return false;
		}
		if (d.versao.value == ""){
			alert("O campo " + d.versao.name + " deve ser preenchido!");
			d.versao.focus();
			return false;
		}
		//validar telefone(verificacao se contem apenas numeros)
		if (isNaN(d.quantidade.value)){
			alert("O campo " + d.quantidade.name + " deve conter apenas numeros!");
			d.quantidade.focus();
			return false;
			}
			
		if (d.dataalualizacao.value == ""){
		alert("O campo " + d.dataalualizacao.name + " deve ser preenchido!");
		d.dataalualizacao.focus();
		return false;
		}
		erro=0;
		hoje = new Date();
		anoAtual = hoje.getFullYear();
		barras = d.dataalualizacao.value.split("/");
		if (barras.length == 3){
			dia = barras[0];
			mes = barras[1];
			ano = barras[2];
			resultado = (!isNaN(dia) && (dia > 0) && (dia < 32)) && (!isNaN(mes) && (mes > 0) && (mes < 13)) && (!isNaN(ano) && (ano.length == 4) && (ano <= anoAtual && ano >= 1900));
			if (!resultado) {
				alert("Formato de data invalido!");
				d.dataalualizacao.focus();
				return false;
			}
		} else {
			alert("Formato de data invalido!");
			d.dataalualizacao.focus();
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
  <p><span class='style1'>CADASTRO DE SOFTWARE </span></p>
</div>
<form name='cadastrodeSoftware'  action='Controladora' method='post'  onSubmit='return validaForm()'>
		<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
				<tr> 
					<td width='175' bgcolor='#F7F7F7'><strong>Numero de S&eacute;rie:</strong></td> 
				    <td width='233'><input name='consnserie' type='text' size='10' maxlength='10'></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
					<td><input name='consnome' type='text' size='30' maxlength='30'></td> 
					<td width='70'><input type='submit' name='consultanome' value='Consultar'></td>
				</tr>
				
				<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Software software = new Software();
										Vector vectorDeNomes = software.listarSoftware();
										
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
					<td width='174' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
				    <td width='314'><input name='nome' type='text' size='30' maxlength='30'></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Descri&ccedil;&atilde;o</strong></td> 
				    <td><input type='text' name='descricao' size='40'></td>
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Quantidade de Licen&ccedil;as </strong></td> 
					<td><input name='quantidade' type='text' size='5' maxlength='5'></td> 
				</tr>
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Vers&atilde;o:</strong></td> 
					<td><input name='versao' type='text' size='10' maxlength='10'></td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Data de Compra: </strong></td> 
				  	<td><input name='datacompra' type='text' size='10'> dd/mm/aaaa</td> 
				</tr> 
				<tr> 
					<td bgcolor='#F7F7F7'><strong>Data de Atualiza&ccedil;&atilde;o: </strong></td> 
					<td><input name='dataalualizacao' type='text' size='10' maxlength='10'> dd/mm/aaaa </td> 
				</tr> 
				<tr> 
					<td colspan='2'>
						  	<div align='center'>
							    <input type='submit' name='Submit' value='Cadastrar' onclick='alteraValorOperacao();'>
							    <input type='reset' name='Limpar' value='Limpar'>
							    <input type='submit' name='Alterar' value='Alterar' onclick='alteraValorOperacao();'>
							    <input type='reset' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
							    <input type='reset' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
				      		</div>
					</td> 
				</tr> 
		  </table> 

		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='cadstrodesoftware'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

