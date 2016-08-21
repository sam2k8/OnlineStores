<%--
  Created by IntelliJ IDEA.
  User: Sayem_ubitrix
  Date: 5/8/2016
  Time: 3:35 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <title><g:layoutTitle default="UxStore" /></title>
    <g:layoutHead/>
</head>

<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Uxstore</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><g:link controller="admin" action="dashboard">Dashboard</g:link></li>
            <li><g:link class="create" controller="admin" action="addmanager">Add Manager</g:link></li>
            <li><g:link controller="product" action="create">Add Product</g:link></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <sec:ifLoggedIn>
                <li><g:link controller="logout"><span class="glyphicon glyphicon-log-out"></span> Logout</g:link></li>
            </sec:ifLoggedIn>

        </ul>
    </div>
</nav>
<g:layoutBody/>



%{--<footer class="footer">
    <div class="container">
        <p class="text-muted">Place sticky footer content here.</p>
    </div>
</footer>--}%
</body>
</html>