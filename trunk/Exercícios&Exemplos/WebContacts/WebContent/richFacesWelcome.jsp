
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!-- RichFaces tag library declaration -->
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<html>
	<head>
		<title>RichFaces Greeter</title>
	</head>
	<body>
		<f:view>
			<a4j:form>
				<rich:panel header="Teste com RichFaces" style="width: 315px">
					<h:outputText value="Seu nome: " />
					<h:inputText value="#{testeBean.nome}">
						<f:validateLength minimum="1" maximum="30" />
					</h:inputText>
		
					<a4j:commandButton value="Go!" reRender="testePanel" />
		
					<h:panelGroup id="testePanel">
	 					<h:outputText value="Olá, " rendered="#{not empty testeBean.nome}" />
						<h:outputText value="#{testeBean.nome}" />
						<h:outputText value="!" rendered="#{not empty testeBean.nome}" />
					</h:panelGroup>
				</rich:panel>
			</a4j:form>
		</f:view>
	</body>
</html>