
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

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
			
			<h:panelGrid columns="2">
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
					
				Data: <rich:calendar />
	
				<rich:dropDownMenu value="Option2" submitMode="none">
					<rich:menuItem value="Suboption2-1" />
					<rich:menuItem value="Suboption2-2" />
					<rich:menuGroup value="Group2">
						<rich:menuItem value="SuboptionG2-2-1" />
						<rich:menuItem value="SuboptionG2-2-2" />
					</rich:menuGroup>
	
				</rich:dropDownMenu>
				
			</h:panelGrid>
			
		</rich:panel>

		<h:graphicImage value="/DiagramaDeDominio.PNG" id="pic"
			style="border : 5px solid #E4EAEF" />
		
		<rich:contextMenu event="oncontextmenu" attachTo="pic"
			submitMode="none">
			<rich:menuItem value="Zoom In" onclick="enlarge('pic');" id="zin"></rich:menuItem>
			<rich:menuItem value="Zoom Out" onclick="decrease('pic');" id="zout"></rich:menuItem>
		</rich:contextMenu>
		
		
		<h:inputText value="Tool Tip" id="tip">
			
			 <rich:toolTip followMouse="true" direction="top-right" showDelay="500" styleClass="tooltip">
	            <span  style="white-space:nowrap">
	               Exemplo de Tool Tip!!!
	            </span>
	        </rich:toolTip>
        </h:inputText>
        
        <a4j:outputPanel id="gallery">
        	<h:graphicImage value="/DiagramaDeDominio.PNG" />
      		
      		 <br style="clear:both" />
      		
		    <rich:jQuery selector="#gallery img" query="addClass('pic-normal')"/>
		    <rich:jQuery selector="#gallery img" query="wrap('&lt;div class=\'wrap1\'&gt;&lt;/div&gt;')" />
		    <rich:jQuery selector="#gallery img" query="mouseover(function(){enlargePic(this)})"/>
		    <rich:jQuery selector="#gallery img" query="mouseout(function(){normalPic(this)})"/>
		    
		    <rich:jQuery name="enlargePic" timing="onJScall" query="stop().animate({width:'60%'})" />
		    <rich:jQuery name="normalPic" timing="onJScall" query="stop().animate({width:'20%'})" />
	        
    	</a4j:outputPanel>  
    	
    	<rich:tabPanel switchType="ajax" width="350" height="400">
                <rich:tab label="Tab1">
                   <h:outputText value="Aba1" />
                </rich:tab>
                
                <rich:tab label="Tab2">
                    <h:outputText value="Outra aba" />
                </rich:tab>
    
            
            </rich:tabPanel>

	</a4j:form>
</f:view>
</body>
</html>