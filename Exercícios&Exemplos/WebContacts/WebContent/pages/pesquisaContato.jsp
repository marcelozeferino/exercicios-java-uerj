
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

	
		<f:view>
			<a4j:keepAlive beanName="pesquisaContatoBean" />
			<a4j:form id="formPesquisa">
				
				<a4j:status id="commonstatus" startText="Processando..." stopText="">
					<f:facet name="start">
						<h:graphicImage value="/resources/processando.gif" id="process" />
					</f:facet>
				</a4j:status>
			
				<br/>
								
				<h:selectBooleanCheckbox value="#{pesquisaContatoBean.buscaAutomatica}" />
				<h:outputText>Busca automática?</h:outputText>
				
				<br/>
				
				<h:outputText>Nome do Contato</h:outputText>
				<h:inputText id="nomeContato" value="#{pesquisaContatoBean.nomeContato}">
					<a4j:support event="onkeyup" action="#{pesquisaContatoBean.pesquisarContatoAutomaticamente}" reRender="tableContatos" />
				</h:inputText>
			
				<a4j:commandButton value="Pesquisar" 
					action="#{pesquisaContatoBean.pesquisarContato}"
					reRender="formPesquisa"/>
				
				<rich:dataTable id="tableContatos"  value="#{pesquisaContatoBean.contatosEncontrados}"
					 var="contato" width="320px" rows="5"
					 onRowMouseOver="this.style.backgroundColor='#F1F1F1'"
                     onRowMouseOut="this.style.backgroundColor='#{a4jSkin.tableBackgroundColor}'"
                     reRender="dataScroller">
				
						<f:facet name="header">
							<h:outputText value="Contatos Encontrados" />
						</f:facet>
						
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Nome" />
							</f:facet>
							<h:outputText value="#{contato.nome}"/> 
						</rich:column>	
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Telefones" />
							</f:facet>
							<h:outputText value="#{contato.listaDeTelefones}"/> 
						</rich:column>
						
						<f:facet name="footer">
							<rich:datascroller id="dataScroller" for="tableContatos" 
								page="#{pesquisaContatoBean.pagina}"> 
							</rich:datascroller>
						</f:facet>					
					</rich:dataTable>
					
					<a4j:commandButton value="Voltar" action="menu" />
			</a4j:form>
		</f:view>
	
</body>
</html>   