
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>..:: WebContacts - Cadastro Web de Contatos</title>
	<jsp:include page="/pages/menu.jsp" />
</head>
<body>


<div align="left" style="width: 60%">

	<f:view>
		<a4j:keepAlive beanName="contatosBean" />
		<a4j:form id="formCadastro">

			<a4j:status id="commonstatus" startText="Processando..." stopText="">
				<f:facet name="start">
					<h:graphicImage value="/resources/processando.gif" id="process" />
				</f:facet>
			</a4j:status>
			
			<br/>

			<h:panelGrid columns="2">
	
				<h:outputLabel value="Nome do Contato: " />
				<h:inputText value="#{contatosBean.contato.nome}" size="50" />
	
			</h:panelGrid>
	
			<rich:panel style="width: 60%"
					header="Adicionar Telefones">
		
					<h:panelGrid columns="2" id="gridDados">
		
						<h:outputLabel value="Tipo: " />
						<rich:comboBox id="cmbTipoTelefoneEmpresa"
							value="#{contatosBean.telefone.tipo.descricao}">
							<f:selectItems value="#{contatosBean.tiposCadastrados}"/>
						</rich:comboBox>
		
						<h:outputLabel value="Número: " />
		
						<a4j:loadScript src="/script/jquerymaskedinput-121.js">
							<h:inputText value="#{contatosBean.telefone.numero}" size="20" id="txtTelefoneEmpresa">
								<rich:jQuery selector="#txtTelefoneEmpresa"
									query="mask('(99) 9999-9999')" timing="onload" />
							</h:inputText>
						</a4j:loadScript>
						
						<a4j:commandButton value="Adicioinar" action="#{contatosBean.adicionarTelefone}"
							reRender="formCadastro"/>
							
						<a4j:commandButton value="Limpar" action="#{contatosBean.limpar}" reRender="formCadastro"/>
							
					</h:panelGrid>
					<rich:dataTable id="tableTelefones"  value="#{contatosBean.telefones}" var="telefone" width="300px" rows="5">
						<f:facet name="header">
							<h:outputText value="Telefones inseridos" />
						</f:facet>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Tipo" />
							</f:facet>
							<h:outputText value="#{telefone.tipo.descricao}"/> 
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Telefone" />
							</f:facet>
							<h:outputText value="#{telefone.numero}"/> 
						</rich:column>
						<rich:column colspan="2">
							<f:facet name="header">
								<h:outputText value="Ações" />
							</f:facet>
							<a4j:commandLink reRender="formCadastro" action="#{contatosBean.alterar}">Alterar</a4j:commandLink> | 
							<a4j:commandLink reRender="formCadastro" action="#{contatosBean.excluir}">Excluir</a4j:commandLink>
						</rich:column>
		
					</rich:dataTable>
					
					<rich:messages showDetail="true" >
					
					</rich:messages>
		
			</rich:panel>
		
			<a4j:commandButton value="Salvar" action="#{contatosBean.salvar}" reRender="formCadastro" />
			<a4j:commandButton  value="Limpar" action="#{contatosBean.limparForm}" reRender="formCadastro" />
			<a4j:commandButton value="Cancelar" action="menu" />
		
		</a4j:form>
	</f:view>
</div>

</body>
</html>