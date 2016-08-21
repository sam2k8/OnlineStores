<%--
  Created by IntelliJ IDEA.
  User: Sayem
  Date: 2/2/2016
  Time: 2:20 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="admintemp">
    <title>Add manager</title>
</head>

<body>
<div class="container">
    <h2>Add Manager</h2>


    <g:form  class="form-horizontal" role="form" url="[action:'savemanager',controller:'admin']">
        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Name:</label>
            <div class="col-sm-10">
                <g:textField name="name" class="form-control" id="name" placeholder="Enter Name"/>
            </div>
        </div>
        
        <div class="form-group">
            <label class="control-label col-sm-2" for="userName">User Name:</label>
            <div class="col-sm-10">
                <g:textField name="username" class="form-control" id="userName" placeholder="Enter Username"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-10">
                <g:textField name="email" class="form-control" id="email" placeholder="Enter Email"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="password">Password:</label>
            <div class="col-sm-10">
                <g:passwordField name="password" class="form-control" id="password" placeholder="Enter Password"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="role">Role:</label>
            <div class="col-sm-10">
                <g:select name="role" id="role" from="${['ROLE_ORDERMANGER', 'ROLE_STOREMANAGER', 'ROLE_PACKAGEMANAGER','ROLE_SHIPPINGMANAGER']}" />
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </g:form>
</div>



</body>
</html>