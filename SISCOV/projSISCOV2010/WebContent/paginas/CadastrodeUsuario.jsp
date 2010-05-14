<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

	<title>SISCOV-WEB [ CADASTRO DE USUÁRIO ]</title>
	
</head>

<body>
<div align='center'>
  <p><img src='imagens/topo.jpg' width='800' height='100'></p>
  <p><span class='style1'>CADASTRO DE USUÁRIO</span>  </div>
  
  
  
  
  
<html:form action="/usuarioAction" >

		
			   <table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000' style='height: 147px; width: 547px'> 
					<tr> 
						<td width='127' bgcolor='#F7F7F7'><strong>Matricula:</strong></td> 
					    <td width='281'><html:text name="usuarioForm" property="matriculaPesquisa" size="10" maxlength="10"/></td> 
					</tr>
					<tr>
						<td bgcolor='#F7F7F7' style='width: 106px'><strong>Nome:</strong></td> 
						<td><html:text name="usuarioForm" property="nomePesquisa" size='35' maxlength='35'/></td> 
						<td width='70' style='width: 81px'><html:submit property="acao" value="Pesquisar" /></td>
					</tr>
					
			</table> 
			<hr color='#CCCCCC'>

	<table  align='center'width='508' border='0' cellpadding='5' cellspacing='0' bordercolor='#000000'> 
			
			<tr> 
				<td colspan="3"><bean:write  name="usuarioForm" property="mensagem" /></td> 
			   
			</tr>
			
			<tr> 
				<td width='126' bgcolor='#F7F7F7'><strong>Nome:</strong></td> 
			  <td width='362'><html:text name="usuarioForm" property="nome"  size='35' maxlength='35'/></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Login:</strong></td> 
				<td><html:text name="usuarioForm" property="login" size='10' maxlength='10'/></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Matricula:</strong></td> 
				<td><html:text name="usuarioForm" property="matricula" size='10' maxlength='10'/></td> 
			</tr>
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Senha:</strong></td> 
				<td><html:password name="usuarioForm" property="senha" size='10' maxlength='10'/></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Email:</strong></td> 
				<td><html:text name="usuarioForm" property="email" size='30' maxlength='30'/> </td> 
			</tr> 
			
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Cargo</strong></td> 
				<td><html:text name="usuarioForm" property="cargo" size='25' maxlength='25'/></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Endere&ccedil;o</strong></td> 
				<td><label><html:text name="usuarioForm" property="endereco" size='40' maxlength='40'/></label>	</td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Cidade</strong></td> 
				<td><html:text name="usuarioForm" property="cidade" size='20' maxlength='20'/></td> 
			</tr> 
			<tr> 
				<td bgcolor='#F7F7F7'><strong>Telefone</strong></td> 
				<td><html:text name="usuarioForm" property="telefone"  size='13' maxlength='13'/>(Apenas n&uacute;meros) </td>
			</tr> 
			<tr> 
			<td bgcolor='#F7F7F7'><strong>Tipo de Acesso</strong> </td> 
				<td>
					
					<html:radio  name="usuarioForm" property="tipoAcesso" value="Administrador" title="Administrador"/>Administrador
					<html:radio  name="usuarioForm" property="tipoAcesso" value="Usuário" title="Usuário"/>Usuário
					
				</td> 
				
			</tr> 
			<tr> 
				<td colspan='3'>
				  	<div align='center'>
					   
					    <html:submit property="acao" value="Cadastrar" /> 
					    <html:submit property="acao" value="Alterar" />  
					    <html:submit property="acao" value="Limpar" /> 
					    <html:submit property="acao" value="Excluir" />
					    <html:link action="/operacoesAction?operacao=voltar">Voltar</html:link>
								    
			      	</div>
				</td> 
			</tr> 
	
	  </table> 

		<input type='hidden' name='operacao' >
		<input type='hidden' name='formulario' value='cadastrodeusuario'>

</html:form><br><br>

<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html:html>
