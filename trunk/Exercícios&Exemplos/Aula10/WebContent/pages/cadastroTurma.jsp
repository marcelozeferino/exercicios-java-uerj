<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
	<head>
		<script language="javascript" type="text/javascript" src="/Aula10/resources/jquery-1.4.2.js"></script>
		<script language="javascript" type="text/javascript" src="/Aula10/resources/jquerymaskedinput-121.js"></script>
		<title>Cadastro de Turmas</title>
	</head>
	<body>
		
		<script language="javascript" type="text/javascript">

			jQuery(function($){
				   $("#formulario\\:inputDataInicio").mask("99/99/9999");
			});	
			
		</script>
		
		<f:view>
		 <h:form id="formulario">
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
