<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Operações de Administrador ]</title>
<style type="text/css">
<!--
.style2 {color: #F0F0F0}
.style3 {
	font-size: 36px;
	font-weight: bold;
	color: #24A6B4;
}
-->
</style>

</head>

<body>
<div align='center'> <p><img src='imagens/topo.jpg' width='800' height='120'></p></div>
<p>&nbsp;</p>




		<table width='821' border='0' align='center'>
		  <tr>
		    <td width="115"><div align="center"><html:link action="/usuarioAction"><img src="icones/256x256.png/usuario.png" width="80" height="80" border="0" ></html:link></div></td>
		    <td width='115'><div align='center'><a href='/paginas/CadastrodeEquipamento.jsp'><img src='icones/256x256.png/equipamento.png' width='80' height='80' border='0'></a></div></td>
		    <td width='115'><div align='center'><a href='/paginas/CadastrodeFornecedor.jsp'><img src='icones/256x256.png/fornecedor.png' width='80' height='80' border='0'></a></div></td>
		    <td width='112'><div align='center'><a href='/paginas/CadastrodeFabricante.jsp'><img src='icones/256x256.png/fabricante.png' width='80' height='80' border='0'></a></div></td>
		    <td width='112'><div align='center'><a href='/paginas/CadastrodeAreaTecnica.jsp'><img src='icones/256x256.png/area.png' width='80' height='80' border='0'></a></div></td>
		    <td width='112'><div align='center'><a href='/paginas/CadastrodeLivro.jsp'><img src='icones/256x256.png/Livro.png' width='80' height='80' border='0'></a></div></td>
		    <td width='110'><div align='center'><a href='/paginas/CadastrodeSoftware.jsp'><img src='icones/256x256.png/sotware.png' width='80' height='80' border='0'></a></div></td>
		  </tr>
		  <tr>
		    <td><div align='center'><a href='/paginas/CadastrodeTecnico.jsp'><img src='icones/256x256.png/Tecnico.png' width='80' height='80' border='0'></a></div></td>
		    <td><div align='center'><a href='/paginas/Relatorios.jsp'><img src='icones/256x256.png/relatorios.png' width='80' height='80' border='0'></a></div></td>
		    <td><div align='center'><img src='icones/256x256.png/novaocorrencia.png' width='80' height='80'></div></td>
		    <td></td>
		    <td></td>
		    <td><div align='center' class='style2'><a href='/paginas/AlterarSenha.jsp'><img src='icones/256x256.png/Alterarsenha.png' width='80' height='80' border='0'></a></div></td>
		    <td><div align='center' class='style2'><html:link action="/operacoesAction?operacao=logout"><img src='icones/256x256.png/logoff.png' width='80' height='80' border='0'></html:link></div></td>
		  </tr>
		</table>
		
		
<p><br>
  <br>
</p>
<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html:html>
