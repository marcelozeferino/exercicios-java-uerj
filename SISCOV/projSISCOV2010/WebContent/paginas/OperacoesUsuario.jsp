<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>SISCOV-WEB [ Operações de Usuário ]</title>

<style type="text/css">

.style1 {
	font-size: 24px;
	font-weight: bold;
	color: #24A6B4;
}
-->
</style>


	<script type="text/javascript">
			function alteraValorOperacao(){
				if("Abrir Chamado"){
					AbrirChamado.operacao.value = "3"; 
				}
				if("Voltar"){
					AbrirChamado.operacao.valeu = "6";
				}
				
	}
	</script>





</head>

<body>
<div align='center'>
  <p><img src='imagens/topo.jpg' width='800' height='120'></p>
</div>

<form  name='OperacoesUsuario' action='Controladora' method='post' >
		<table width='487' border='0' align='center'>
		  <tr>
		    <td width='93'><div align='center'><a href='/paginas/AbrirChamado.jsp'><img src='icones/256x256.png/abrirchamado.png' width='80' height='80' border='0'></a></div></td>
		    <td width='93'><a href='ConsultarChamado.html'><img src='icones/256x256.png/ConsultaChamado.png' width='80' height='80' border='0'></a></td>
		    <td width='93'><img src='icones/256x256.png/duvidas.png' width='80' height='80'></td>
		    <td width='88'><a href='AlterarSenha.html'><img src='icones/256x256.png/Alterarsenha.png' width='80' height='80' border='0'></a></td>
		    <td width='98'><a href='Login.html'><img src='icones/256x256.png/logoff.png' width='80' height='80' border='0'></a></td>
		  </tr>
		</table>
		<input type="hidden" name="operacao" value="" />
		<input type="hidden" name="formulario" value="operacoesusuario" />
</form>

<p><br>
  <br>
</p>
<div align='center'>PAMO  - Plano de Assist&ecirc;ncia Medica e Odontol&oacute;gica <br>
  Av.  Rio Branco, 156 &ndash; Centro, Rio de Janeiro/RJ CEP: 20040-003 </div>
</body>
</html>
