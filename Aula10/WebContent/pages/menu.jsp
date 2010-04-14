<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>

		<f:loadBundle var="messages" basename="br.com.uerj.messages.Messages" />
		<title>Manuteção de Alunos e Turmas</title>
		
		
	</head>
	<body>
		<f:view>
		 <h:form>
		
			<h2><i> <h:outputText value="#{messages.header}"/> </i> </h2> 
			<h4> <h:outputText value="#{menuBean.dataAtual}"/> </h4>
			
			<ul>
				<li><h:commandLink action="cadastroAluno">Cadastro de Alunos </h:commandLink> </li>
				<li><h:commandLink action="listaDeAlunos">Lista de Alunos </h:commandLink> </li>
				<li><h:commandLink action="cadastroTurma">Cadastro de Turmas </h:commandLink> </li>
				<li><h:commandLink action="listaDeTurmas">Lista de Turmas </h:commandLink> </li>
			</ul>
			
			
		 </h:form>	
		</f:view>
	</body>	
</html>  
