
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>


<html>
<head>
	<title>..:: WebContacts - Cadastro Web de Contatos</title>
	
	<h2> WebContacts - Seus contatos via Web </h2>
		
</head>
<body>
<f:view>
	<h:form>
		<h:panelGrid columns="2">
			<rich:dropDownMenu
				value="Cadastro" submitMode="none" direction="auto">
				<rich:menuItem value="Contatos" />
				<rich:menuItem value="Tipos de Telefones" />	
			</rich:dropDownMenu>
	
			<rich:dropDownMenu
				value="Pesquisa" submitMode="none" direction="auto">
				<rich:menuItem value="Contatos" />
				<rich:menuItem value="Telefones" />	
			</rich:dropDownMenu>
		</h:panelGrid>

	</h:form>
</f:view>
</body>
</html>
