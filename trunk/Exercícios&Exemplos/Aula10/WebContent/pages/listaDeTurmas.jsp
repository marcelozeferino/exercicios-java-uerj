<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		
			<h:form>
			
				<h:dataTable value="#{turmaBean.turmas}" 
					var="turma" border="1">
                    
					<h:column>
						<f:facet name="header">
							<h:outputText value="Código" />
						</f:facet>
						<h:commandLink action="#{turmaBean.selecionarTurma}" value="#{turma.codigo}" />
					</h:column>
					
					<h:column>
						<f:facet name="header">
							<h:outputText value="Data Início" />
						</f:facet>
						<h:outputText value="#{turma.dataInicio}" />
					</h:column>
					
					<h:column>
						<f:facet name="header">
							<h:outputText value="Carga Horária" />
						</f:facet>
						<h:outputText value="#{turma.cargaHoraria}" />
					</h:column>					
				
				</h:dataTable>
				
				<br/>
				
				<h:commandButton action="menu" value="Voltar" />
				
			</h:form>
			
		</f:view>
	</body>	
</html>  
