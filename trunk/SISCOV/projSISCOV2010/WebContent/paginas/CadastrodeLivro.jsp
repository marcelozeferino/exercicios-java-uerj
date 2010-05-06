<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="livro.ControladoraLivro"%>
<%@page import="livro.Livro"%>
<%@page import="livro.LivroDAO"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE LIVRO ]</title>
<script language="JavaScript"> 
	function validaForm(Form){
	
	
		d = document.CadastrodeLivro;
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
		if (d.quantidade.value == ""){
			alert("O campo " + d.quantidade.name + " deve ser preenchido!");
			d.quantidade.focus();
			return false;
		}
		//validar telefone(verificacao se contem apenas numeros)
		if (isNaN(d.quantidade.value)){
			alert("O campo " + d.quantidade.name + " deve conter apenas numeros!");
			d.quantidade.focus();
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
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CADASTRO DE LIVRO </span></p>
</div>
<form name='CadastrodeLivro'  action='Controladora' method='post'  onSubmit='return validaForm()'>
<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='136' bgcolor='#F7F7F7'><strong>Numero de S&eacute;rie:</strong></td> 
		    <td width='272'><input name='consnserie' type='text' size='10' maxlength='10'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
			<td><input name='consnome' type='text' size='30' maxlength='30'></td> 
			<td width='70'><input type='submit' name='consultanome' value='Pesquisar'></td>
		</tr>
		<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Livro livro = new Livro();
										Vector vectorDeNomes = livro.listarLivro();
										
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
			<td width='134' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
		    <td width='354'><input name='nome' type='text' size='30' maxlength='30'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo Suporte :</strong></td> 
		    <td><label>
		    		<select name='tsuporte'>
		        		<option>Escolha o Tipo de Suporte</option>
	          		</select>
	          	</label>
	        </td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Numero de Série: </strong></td> 
			<td><input name='fantasia' type='text' size='10' maxlength='10'></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Quantidade:</strong></td> 
			<td><input name='quantidade' type='text' size='5' maxlength='5'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>ISBN:</strong></td> 
			<td><input name='isbn' type='text' size='10' maxlength='10'></td> 
		</tr> 
		<tr> 
			<td colspan='2'>
				  	<div align='center'>
					    <input type='submit' name='Submit' value='Cadastrar' onclick='alteraValorOperacao();'>
		 			    <input type='submit' name='Alterar' value='Alterar' onclick='alteraValorOperacao();'>
					    <input type='reset' name='Limpar' value='Limpar'>
					    <input type='submit' name='Excluir' value='Excluir' onclick='alteraValorOperacao();'>
				    	<input type='submit' name='Voltar' value='Voltar' onclick='alteraValorOperacao();'>
			    	</div>
			</td> 
		</tr> 
  </table> 
  		<input type='hidden' name='operacao' value=''>
		<input type='hidden' name='formulario' value='cadastrodelivro'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>

