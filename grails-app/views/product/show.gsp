
<%@ page import="uxstore.Product" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'product.label', default: 'Product')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-product" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-product" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list product">
			
				<g:if test="${productInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="product.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${productInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.unitPrice}">
				<li class="fieldcontain">
					<span id="unitPrice-label" class="property-label"><g:message code="product.unitPrice.label" default="Unit Price" /></span>
					
						<span class="property-value" aria-labelledby="unitPrice-label"><g:fieldValue bean="${productInstance}" field="unitPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.image1}">
				<li class="fieldcontain">
					<span id="image1-label" class="property-label"><g:message code="product.image1.label" default="Image1" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.category}">
				<li class="fieldcontain">
					<span id="category-label" class="property-label"><g:message code="product.category.label" default="Category" /></span>
					
						<span class="property-value" aria-labelledby="category-label"><g:fieldValue bean="${productInstance}" field="category"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="product.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${productInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.image2}">
				<li class="fieldcontain">
					<span id="image2-label" class="property-label"><g:message code="product.image2.label" default="Image2" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.image3}">
				<li class="fieldcontain">
					<span id="image3-label" class="property-label"><g:message code="product.image3.label" default="Image3" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.image4}">
				<li class="fieldcontain">
					<span id="image4-label" class="property-label"><g:message code="product.image4.label" default="Image4" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.productMng}">
				<li class="fieldcontain">
					<span id="productMng-label" class="property-label"><g:message code="product.productMng.label" default="Product Mng" /></span>
					
						<span class="property-value" aria-labelledby="productMng-label"><g:fieldValue bean="${productInstance}" field="productMng"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.shippingMng}">
				<li class="fieldcontain">
					<span id="shippingMng-label" class="property-label"><g:message code="product.shippingMng.label" default="Shipping Mng" /></span>
					
						<span class="property-value" aria-labelledby="shippingMng-label"><g:fieldValue bean="${productInstance}" field="shippingMng"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.storeMng}">
				<li class="fieldcontain">
					<span id="storeMng-label" class="property-label"><g:message code="product.storeMng.label" default="Store Mng" /></span>
					
						<span class="property-value" aria-labelledby="storeMng-label"><g:fieldValue bean="${productInstance}" field="storeMng"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.unitType}">
				<li class="fieldcontain">
					<span id="unitType-label" class="property-label"><g:message code="product.unitType.label" default="Unit Type" /></span>
					
						<span class="property-value" aria-labelledby="unitType-label"><g:fieldValue bean="${productInstance}" field="unitType"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:productInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${productInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
