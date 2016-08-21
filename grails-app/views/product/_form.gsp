<%@ page import="uxstore.Product" %>

<div class="form-group">
    <label class="control-label col-sm-2" for="name">Product Name:</label>
    <div class="col-sm-10">
        <g:textField  class="form-control" name="name" required="" value="${productInstance?.name}"/>
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="description">Product Description:</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="description" required="" value="${productInstance?.description}"/>
    </div>
</div>
<div class="form-group">
    <label class="control-label col-sm-2" for="unitPrice">Per Unit Price:</label>
    <div class="col-sm-10">
        <g:field class="form-control" type="number" name="unitPrice"  value="${fieldValue(bean: productInstance, field: 'unitPrice')}"/>
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="category">Product Category :</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="category" required="" value="${productInstance?.category}"/>
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="image1">First Image:</label>
    <div class="col-sm-10">
        <input class="form-control" type="file" id="image1" name="image1" />
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="image3">Second Image:</label>
    <div class="col-sm-10">
        <input class="form-control" type="file" id="image2" name="image2" />
    </div>
</div>
<div class="form-group">
    <label class="control-label col-sm-2" for="image3">Third Image:</label>
    <div class="col-sm-10">
        <input class="form-control" type="file" id="image3" name="image3" />
    </div>
</div>
%{--<div class="form-group">
    <label class="control-label col-sm-2" for="image4">Fourth Image:</label>
    <div class="col-sm-10">
        <input type="file" id="image4" name="image4" />
    </div>
</div>--}%

<div class="form-group">
    <label class="control-label col-sm-2" for="productMng">Product Manager:</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="productMng" required="" value="${productInstance?.productMng}"/>
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="storeMng">Store Manager:</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="storeMng" required="" value="${productInstance?.storeMng}"/>
    </div>
</div>
<div class="form-group">
    <label class="control-label col-sm-2" for="shippingMng">Shipping Manager:</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="shippingMng" required="" value="${productInstance?.shippingMng}"/>
    </div>
</div>
<div class="form-group">
    <label class="control-label col-sm-2" for="packageMng">Package Manager:</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="packageMng" required="" value="${productInstance?.packageMng}"/>
    </div>
</div>
<div class="form-group">
    <label class="control-label col-sm-2" for="unitType">Unit Type</label>
    <div class="col-sm-10">
        <g:textField class="form-control" name="unitType" required="" value="${productInstance?.unitType}"/>
    </div>
</div>





%{--<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'unitPrice', 'error')} required">
    <label for="unitPrice">
        <g:message code="product.unitPrice.label" default="Unit Price" />
        <span class="required-indicator">*</span>
    </label>
    <g:field name="unitPrice" value="${fieldValue(bean: productInstance, field: 'unitPrice')}" required=""/>
</div>--}%
%{--<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} required">
    <label for="description">
        <g:message code="product.description.label" default="Description" />
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="description" required="" value="${productInstance?.description}"/>

</div>
--}%%{--<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="product.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${productInstance?.name}"/>

</div>--}%








