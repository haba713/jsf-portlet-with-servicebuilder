
<%@page contentType="text/html" pageEncoding="UTF-8"
	import="com.liferay.portal.kernel.util.*,java.util.*,javax.portlet.*,com.example.inventory.*"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>

<f:view>
	<h:form id="inventory-viewform" binding="#{View.form}">
		<h3>
			<h:outputLabel for="" value="#{msgs.product_list}" />
		</h3>
		<%--
        <h:dataTable value="#{View.products}" var="item" border="1">
            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msgs.code}" />
                </f:facet>
                <h:outputText value="#{item.code}" />
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msgs.name}" />
                </f:facet>
                <h:outputText value="#{item.name}" />
            </h:column>
        </h:dataTable>
        <hr />
		<h3>
			<h:outputLabel for="" value="#{msgs.add_product}" />
		</h3>
		<table>
			<tr>
				<td><h:outputLabel for="code" value="#{msgs.code}" /></td>
				<td><h:inputText id="code" value="#{View.code}" /></td>
			</tr>
			<tr>
				<td><h:outputLabel for="name" value="#{msgs.name}" /></td>
				<td><h:inputText id="name" value="#{View.name}" /></td>
			</tr>
            <tr>
                <td colspan="2">
                    <h:commandButton value="#{msgs.add}" action="#{View.addProduct}" />
                </td>
            </tr>
		</table>
		--%>
	</h:form>

</f:view>


