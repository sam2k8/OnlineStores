<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admintemp">
		<title>Create New Product</title>
	</head>
	<body>
    <div class="container">
        <g:form class="form-horizontal" role="form" url="[controller:'product', action:'saveProduct']"  enctype="multipart/form-data">
            <fieldset class="form">
                <g:render template="form"/>
            </fieldset>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <g:submitButton name="Submit" class="btn btn-default" value="${message(code: 'default.button.create.label', default: 'Create')}" />

                </div>
            </div>

        </g:form>

    </div>







	</body>
</html>
