<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<title>Cadastro de Turmas</title>
	</head>
	<body>
		<f:view>
		 <h:form>
			<h:panelGroup>
			
				<h:panelGrid columns="2">
					
					<h:outputLabel value="C�digo:" for="inputCodigo" />
					<h:inputText value="#{turmaBean.turma.codigo}" id="inputCodigo"/>
					
					<h:outputLabel value="Data de In�cio:" for="inputDataInicio" />
					<h:inputText value="#{turmaBean.turma.dataInicio}" id="inputDataInicio">
						<f:convertDateTime type="date" dateStyle="medium"/>
					</h:inputText>
					
									
					<h:outputLabel value="Carga Hor�ria:" for="inputCarga" />
					<h:inputText value="#{turmaBean.turma.cargaHoraria}" id="inputCarga"/>
			
					
				</h:panelGrid>
				
				<h:commandButton action="#{turmaBean.salvarTurma}" value="Salvar" />
				<h:commandButton action="menu" value="Voltar" />
				
				<br/>
				
				<h:messages id="mensagens" />
			
			</h:panelGroup>
		
		 </h:form>	
		</f:view>
	</body>	
</html>  
