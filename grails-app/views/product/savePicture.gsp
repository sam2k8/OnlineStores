<%--
  Created by IntelliJ IDEA.
  User: Sayem_ubitrix
  Date: 5/14/2016
  Time: 11:42 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="admintemp">
    <title>Test</title>
</head>

<body>
<g:uploadForm name="picUploadForm" class="well form-horizontal" controller="product" action="savePictureToFolder">

    Select Picture: <input type="file" name="productPic"/>
    <button type="submit" class="btn btn-success"><g:message code="shopItem.btn.saveProductImage" default="Save Image" /></button>



</g:uploadForm>

</body>
</html>