<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="equipamento.ControladoraEquipamento"%>
<%@page import="equipamento.Equipamento"%>
<%@page import="equipamento.EquipamentoDAO"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE EQUIPAMENTO ]</title>
<script language="JavaScript"> 
	function validaForm(Form){
	
		d = document.CadastrodeEquipamento;
		if (d.nome.value == ""){
			alert("O campo " + d.nome.name + " deve ser preenchido!");
			d.nome.focus();
			return false;
		}
			if (d.tipo.value == ""){
			alert("O campo " + d.tipo.name + " deve ser preenchido!");
			d.tipo.focus();
			return false;
		}
			
			if (d.modelo.value == ""){
			alert("O campo " + d.modelo.name + " deve ser preenchido!");
			d.modelo.focus();
			return false;
		}
			
				
	
		if (d.nepat.value == ""){
			alert("O campo " + d.nepat.name + " deve ser preenchido!");
			d.nepat.focus();
			return false;
		}
			
		 	if (d.nserie.value == ""){
			alert("O campo " + d.nserie.name + " deve ser preenchido!");
			d.nserie.focus();
			return false;
		}
		if (isNaN(d.nserie.value)){
			alert("O campo " + d.nserie.name + " deve conter apenas numeros!");
			d.nserie.focus();
			return false;
			}
			if (d.lacre.value == ""){
			alert("O campo " + d.lacre.name + " deve ser preenchido!");
			d.lacre.focus();
			return false;
		}
				if (d.esp.value == ""){
			alert("O campo " + d.esp.name + " deve ser preenchido!");
			d.esp.focus();
			return false;
		}
			if (d.licenca.value == ""){
			alert("O campo " + d.licenca.name + " deve ser preenchido!");
			d.licenca.focus();
			return false;
		}
		if (d.esp.value == ""){
			alert("O campo " + d.esp.name + " deve ser preenchido!");
			d.esp.focus();
			return false;
		}
			
		if (d.nfiscal.value == ""){
			alert("O campo " + d.nfiscal.name + " deve ser preenchido!");
			d.nfiscal.focus();
			return false;
		}
		//validar telefone(verificacao se contem apenas numeros)
		if (isNaN(d.nfiscal.value)){
			alert("O campo " + d.nfiscal.name + " deve conter apenas numeros!");
			d.nfiscal.focus();
			return false;
		}
		//validar data de nascimento
		erro=0;
		hoje = new Date();
		anoAtual = hoje.getFullYear();
		barras = d.datacompra.value.split("/");
		if (barras.length == 3){
			dia = barras[0];
			mes = barras[1];
			ano = barras[2];
			resultado = (!isNaN(dia) && (dia > 0) && (dia < 32)) && (!isNaN(mes) && (mes > 0) && (mes < 13)) && (!isNaN(ano) && (ano.length == 4) && (ano <= anoAtual && ano >= 1900));
			if (!resultado) {
				alert("Formato de data invalido!");
				d.datacompra.focus();
				return false;}
		
			} else {
			alert("Formato de data invalido!");
			d.datacompra.focus();
			return false;
		}
		
		if (d.garantia.value == ""){
			alert("O campo " + d.garantia.name + " deve ser preenchido!");
			d.garantia.focus();
			return false;
		}
			if (d.fab.value == ""){
			alert("O campo " + d.fab.name + " deve ser preenchido!");
			d.fab.focus();
			return false;
		}
			if (d.forn.value == ""){
			alert("O campo " + d.forn.name + " deve ser preenchido!");
			d.forn.focus();
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
  <p><span class='style1'>CADASTRO DE EQUIPAMENTO </span>  
</div>
<form name='CadastrodeEquipamento' action='Controladora' method='post' onSubmit='return validaForm()'>
  <table  align='center'width='609' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'>
    <tr>
      <td width='126' bgcolor='#F7F7F7'><strong>Nome:</strong></td>
      <td width='332'><input name='consnome' type='text' size='45' maxlength='45'></td>
    </tr>
    <tr>
      <td bgcolor='#F7F7F7'><strong>NEPAT:</strong></td>
      <td><input name='consnepat' type='text' size='10' maxlength='10'></td>
      <td width='121' align='center'><input type='submit' name='consulta_nepat' value='Pesquisa' ></td>
    </tr>
    <tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Equipamento equipamento = new Equipamento();
										Vector vectorDeNomes = equipamento.listarEquipamento();
										
										for(int i=0 ; i<vectorDeNomes.size() ; i++){ %>
											<option><%=vectorDeNomes.get(i)%></option>
									 	<%}--%>
									
							</select>
						</td>
	</tr>
    
  </table>
  <hr color='#CCCCCC'>
  <table  align='center'width='609' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='124' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
		  <td width='465'><input type='text' name='nome' size='45' maxlength='45'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo:</strong></td> 
			<td><input type='text' name='tipo' size='45' maxlength='45'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Modelo:</strong></td> 
			<td><input name='modelo' type='text' size='35' maxlength='35'></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>NEPAT:</strong></td> 
			<td><input name='nepat' type='text' size='10' maxlength='10'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Numero de Serie: </strong></td> 
		  <td><input name='nserie' type='text' size='25' maxlength='25'></td> 
		</tr> 
		
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Lacre:</strong></td> 
			<td><input name='lacre' type='text' size='25' maxlength='25'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Licen&ccedil;a SO </strong></td> 
			<td><input name='licenca' type='text' size='25' maxlength='25'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Especifica&ccedil;&atilde;o</strong></td> 
			<td><input name='esp' type='text' size='50' maxlength='50'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nota Fiscal: </strong></td> 
			<td><input name='nfiscal' type='text' size='10' maxlength='10'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Data de Compra:</strong></td> 
			<td><input name='datacompra' type='text' size='10' maxlength='10'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Garantia:</strong></td> 
			<td><input name='garantia' type='text' size='10' maxlength='10'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Fornecedor:</strong></td> 
			<td>
				<input type='text' name='forn' size='35'>
		      	<input type='submit' name='consulta_forn' value='Pesquisa Fornecedor'>
			</td> 
		</tr>  
		<tr> 
		<td bgcolor='#F7F7F7'><strong>Fabricante:</strong></td> 
			<td>
				  <input type='text' name='fab' size='35'>
			      <input type='submit' name='consulta_fab' value='Pesquisa Fabricante'>
			</td> 
		</tr> 
		<tr> 
			<td colspan='2'>
			  	<div align='center'>
				    <input type='submit' name='Submit' value='Cadastrar' onclick='alteraValorOperacao();'>
				    <input type='submit' name='Alterar' value='Alterar' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Limpar' value='Limpar'>
				    <input type='reset' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
		      	</div>
			</td> 
		</tr> 
  </table> 
		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='cadastrodeequipamento'>  
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
