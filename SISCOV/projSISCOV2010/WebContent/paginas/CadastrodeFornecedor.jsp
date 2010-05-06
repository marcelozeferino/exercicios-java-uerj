<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="fornecedor.ControladoraFornecedor"%>
<%@page import="fornecedor.Fornecedor"%>
<%@page import="fornecedor.FornecedorDAO"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE FORNECEDOR ]</title>
<script language="JavaScript"> 
	
	function validaForm(Form){
		d = document.CadastrodeFornecedor;
		if (d.cnpj.value == ""){
			alert("O campo " + d.cnpj.name + " deve ser preenchido!");
			d.cnpj.focus();
			return false;
		}
		
		if (isNaN(d.cnpj.value)){
			alert("O campo " + d.cnpj.name + " deve conter apenas numeros!");
			d.cnpj.reset();
			d.cnpj.focus();
			return false;
		}
			
		
		if (d.nomerazao.value == ""){
			alert("O campo " + d.nomerazao.name + " deve ser preenchido!");
			d.nomerazao.focus();
			return false;
		}
			if (d.nomefantasia.value == ""){
			alert("O campo " + d.nomefantasia.name + " deve ser preenchido!");
			d.nomefantasia.focus();
			return false;
		}
			 if (d.endereco.value == ""){
			alert("O campo " + d.endereco.name + " deve ser preenchido!");
			d.endereco.focus();
			return false;
		}
			if (d.cep.value == ""){
			alert("O campo " + d.cep.name + " deve ser preenchido!");
			d.cep.focus();
			return false;
		}
		
		if (isNaN(d.cep.value)){
			alert("O campo " + d.cep.name + " deve conter apenas numeros!");
			d.cep.focus();
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
		if (d.ramo.value == ""){
			alert("O campo " + d.ramo.name + " deve ser preenchido!");
			d.ramo.focus();
			return false;
		}
			
		
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
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CADASTRO DE FORNECEDOR  </span></p>
</div>
<form name='CadastrodeFornecedor'  action='Controladora' method='post'  onSubmit='return validaForm()'>
<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='136' bgcolor='#F7F7F7'><strong>CNPJ:</strong></td> 
		    <td width='272'><input name='conscnpj' type='text' size='16' maxlength='16'>
		  <label></label></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
			<td><input name='consultanome' type='text' size='35' maxlength='35'></td> 
			<td width='70'><input type='submit' name='consultanome' value='Pesquisar' ></td>
		</tr>
		<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Fornecedor fornecedor = new Fornecedor();
										Vector vectorDeNomes = fornecdedor.listarFornecedor();
										
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
			<td width='134' bgcolor='#F7F7F7'><strong>CNPJ:</strong></td> 
		    <td width='354'><input name='cnpj' type='text' size='16' maxlength='16'>
			  				<label>(Apenas n&uacute;meros) </label>
			</td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome :</strong></td> 
		    <td><input name='nomerazao' type='text' size='35' maxlength='35'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome Fantasia </strong></td> 
			<td><input name='nomefantasia' type='text' size='35' maxlength='35'></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Endere&ccedil;o</strong></td> 
			<td><input name='endereco' type='text' size='35' maxlength='35'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Cep:</strong></td> 
		  	<td><input name='cep' type='text' size='10' maxlength='8'> 
		  							<label>(Apenas n&uacute;meros) </label>
		  	</td> 
		</tr> 
		
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Telefone</strong></td> 
		  	<td><input name='telefone' type='text' size='13' maxlength='13'>
		    					<label>(Apenas n&uacute;meros) </label>
		    </td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Ramo de Atividade </strong></td> 
			<td>
			  <select name='select'>
			    <option>Escolha o Ramo</option>
	          </select>
			</td> 
		</tr> 
		<tr> 
			<td colspan='2'>
			  <div align='center'>
				    <input type='submit' name='Cadastrar' value='Cadastrar' onclick='alteraValorOperacao();' >
	  			    <input type='submit' name='Alterar' value='Alterar' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Limpar' value='Limpar'>
				    <input type='reset' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
				    <input type='reset' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
		      </div>
			</td> 
		</tr> 
  </table> 
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

