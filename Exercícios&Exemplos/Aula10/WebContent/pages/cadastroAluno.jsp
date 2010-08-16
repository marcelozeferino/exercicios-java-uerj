<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title>Cadastro de Alunos</title>
	</head>
	<body>
		<f:view>
		 <h:form>
			<h:panelGroup>
			
				<h:panelGrid columns="2">
					
					<h:outputLabel value="Matrícula:" for="inputMat" />
					<h:inputText value="#{alunoBean.aluno.matricula}" id="inputMat"/>
					
					<h:outputLabel value="Nome:" for="inputNome" />
					<h:inputText value="#{alunoBean.aluno.nome}" id="inputNome" />
									
					<h:outputLabel value="Turma:" for="comboTurma" />
					<h:selectOneMenu id="comboTurma" value="#{alunoBean.aluno.turma}"  >
						<f:selectItems value="#{alunoBean.turmasCadastradas}"/>
						<f:converter converterId="TurmaConverter"/>												
					</h:selectOneMenu>				
									
					
				</h:panelGrid>
				
				<h:commandButton action="#{alunoBean.salvarAluno}" value="Salvar" />
				<h:commandButton action="menu" value="Voltar" />
				
				<br/>
				
				<h:messages id="mensagens" />
			
			</h:panelGroup>
		
		 </h:form>	
		</f:view>
	</body>	
</html>  
