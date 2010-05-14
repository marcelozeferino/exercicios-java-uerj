<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="fabricante.ControladoraFabricante"%>
<%@page import="fabricante.Fabricante"%>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ CADASTRO DE FABRICANTE ]</title>
<script language="JavaScript"> 

	function validaForm(Form){
		d = document.CadastroFabricante;
		if (d.cnpj.value == ""){
			alert("O campo " + d.cnpj.name + " deve ser preenchido!");
			d.cnpj.focus();
			return false;
		}
		
		if (isNaN(d.cnpj.value)){
			alert("O campo " + d.cnpj.name + " deve conter apenas numeros!");
			d.cnpj.focus();
			return false;
		}	
		
		if (d.nome.value == ""){
			alert("O campo " + d.nome.name + " deve ser preenchido!");
			d.nome.focus();
			return false;
		}
			if (d.fantasia.value == ""){
			alert("O campo " + d.fantasia.name + " deve ser preenchido!");
			d.fantasia.focus();
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

	
	function FormataCNPJ(cnpj, teclapres){

   var tecla = teclapres.keyCode;

   var vr = new String(cnpj.value);
   vr = vr.replace(".", "");
   vr = vr.replace(".", "");
   vr = vr.replace("/", "");
   vr = vr.replace("-", "");

   tam = vr.length + 1 ;

   
   if (tecla != 9 && tecla != 8){
      if (tam > 2 && tam < 6)
         cnpj.value = vr.substr(0, 2) + '.' + vr.substr(2, tam);
      if (tam >= 6 && tam < 9)
         cnpj.value = vr.substr(0,2) + '.' + vr.substr(2,3) + '.' + vr.substr(5,tam-5);
      if (tam >= 9 && tam < 13)
         cnpj.value = vr.substr(0,2) + '.' + vr.substr(2,3) + '.' + vr.substr(5,3) + '/' + vr.substr(8,tam-8);
      if (tam >= 13 && tam < 15)
         cnpj.value = vr.substr(0,2) + '.' + vr.substr(2,3) + '.' + vr.substr(5,3) + '/' + vr.substr(8,4)+ '-' + vr.substr(12,tam-12);
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
	color: #24A6B4;
	font-weight: bold;
}
-->
</style>
</head>

<body>
<div align='center'>
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CADASTRO DE FABRICANTE</span>
</div>


  <form name='CadastroFabricante'  action='Controladora' method='post'  onSubmit='return validaForm()'>
<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
		<tr> 
			<td width='136' bgcolor='#F7F7F7'><strong>CNPJ:</strong></td> 
		    <td width='272'><input name='conscnpj' type='text' size='18' maxlength='18'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
			<td><input name='consnome' type='text' size='35' maxlength='35'></td> 
			<td width='70'><input type='submit' name='consultanome' value='Consultar'></td>
		</tr>
		<tr style='width: 505px'>
						<td bgcolor='#F7F7F7'><strong>Lista:</strong></td>
						<td>
							<select style='width: 263px' onmouseup='validaEvento(form);'>
									<%--
										Fabricante fabricante = new Fabricante();
										Vector vectorDeNomes = fabricante.listarFabricante();
										
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
		    <td width='354'><input name='cnpj' type='text' size='18' maxlength='18' id='cnpj' onkeypress='FormataCNPJ(this, event)'>
			  				<label>(Apenas n&uacute;meros) </label>
			</td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
		    <td><input name='nome' type='text' size='35' maxlength='35'></td>
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Nome Fantasia </strong></td> 
			<td><input name='fantasia' type='text' size='35' maxlength='35'></td> 
		</tr>
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Endere&ccedil;o</strong></td> 
			<td><input name='endereco' type='text' size='35' maxlength='35'></td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Cep:</strong></td> 
		  <td><input name='cep' type='text' size='10' maxlength='8'>
		    				(Apenas n&uacute;meros)
		  </td> 
		</tr> 
		
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Telefone</strong></td> 
		  <td><input name='telefone' type='text' size='13' maxlength='13'>
		    				(Apenas n&uacute;meros) 
		  </td> 
		</tr> 
		<tr> 
			<td bgcolor='#F7F7F7'><strong>Ramo de Atividade </strong></td> 
		  	<td><select name='List_area'>
			  		<option>Escolha o Ramo</option>
		    	</select>
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
		<input type='hidden' name='formulario' value='cadastrodefabricante'>
</form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
