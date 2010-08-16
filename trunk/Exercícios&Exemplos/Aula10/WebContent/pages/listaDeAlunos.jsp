<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title>Lista de Alunos</title>
	</head>
	<body>
		<f:view>
		
			<h:form>
			
				<h:dataTable value="#{alunoBean.alunos}" 
					var="aluno" border="1">
                    
					<h:column>
						<f:facet name="header">
							<h:outputText value="Matrícula" />
						</f:facet>
						<h:commandLink action="#{alunoBean.selecionarAluno}" value="#{aluno.matricula}" />
					</h:column>
					
					<h:column>
						<f:facet name="header">
							<h:outputText value="Nome" />
						</f:facet>
						<h:outputText value="#{aluno.nome}" />
					</h:column>
					
					<h:column>
						<f:facet name="header">
							<h:outputText value="Turma" />
						</f:facet>
						<h:outputText value="#{aluno.turma}" />
					</h:column>					
				
				</h:dataTable>
				
				<br/>
				
				<h:commandButton action="menu" value="Voltar" />
				
			</h:form>
			
		</f:view>
	</body>	
</html>  
