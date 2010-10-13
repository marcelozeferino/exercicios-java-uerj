
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
	<a4j:form id="formCadastro">


		<rich:tabPanel switchType="ajax" width="700" height="550">
			<rich:tab label="Contatos Pessoais">
				
			</rich:tab>

			<rich:tab label="Contatos Empresa">

				<h:panelGrid columns="2">

					<h:outputLabel value="Tipo: " />
					<rich:comboBox id="cmbTipo">
						<f:selectItem itemValue="Pessoal" />
						<f:selectItem itemValue="Empresa" />
					</rich:comboBox>

					<h:outputLabel value="Nome: " />
					<h:inputText value="" size="50" />

					<h:outputLabel value="Nome Fantasia: " />
					<h:inputText id="txtNomeFantasia" value="" size="50" />

				</h:panelGrid>

				<rich:simpleTogglePanel switchType="client"
					label="Adicionar Telefones">

					<h:panelGrid columns="2">

						<h:outputLabel value="Tipo: " />
						<rich:comboBox id="cmbTipoTelefoneEmpresa">
							<f:selectItem itemValue="Residencial" />
							<f:selectItem itemValue="Comercial" />
						</rich:comboBox>

						<h:outputLabel value="Número: " />

						<a4j:loadScript src="/script/jquerymaskedinput-121.js">
							<h:inputText value="" size="20" id="txtTelefoneEmpresa">
								<rich:jQuery selector="#txtTelefoneEmpresa"
									query="mask('(99) 9999-9999')" timing="onload" />
							</h:inputText>
						</a4j:loadScript>

					</h:panelGrid>
					<rich:dataTable value="" var="cap" width="300px" rows="5">
						<f:facet name="header">
							<h:outputText value="Telefones inseridos" />
						</f:facet>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Tipo" />
							</f:facet>
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Telefone" />
							</f:facet>
						</rich:column>
						<rich:column colspan="2">
							<f:facet name="header">
								<h:outputText value="Ações" />
							</f:facet>
							<a4j:commandLink>Alterar</a4j:commandLink> | 
							<a4j:commandLink>Excluir</a4j:commandLink>
						</rich:column>

					</rich:dataTable>

				</rich:simpleTogglePanel>

			</rich:tab>


		</rich:tabPanel>

            
	</a4j:form>
</f:view>


</body>
</html>