<%--
  Created by IntelliJ IDEA.
  User: Sayem
  Date: 2/2/2016
  Time: 5:45 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="usertemp">
    <meta nav="track">
    <title>Track</title>
    <link rel="stylesheet" type="text/css" href="<g:createLinkTo dir='css' file='custom.css'/>">
    <style type="text/css">
    @media {
        .container {
           /* width: 920px;*/
        }
    }

    #custom-search-input {
        padding: 3px;
        border: solid 1px #E4E4E4;
        border-radius: 6px;
        background-color: #fff;
    }

    #custom-search-input input {
        border: 0;
        box-shadow: none;
    }

    #custom-search-input button {
        margin: 2px 0 0 0;
        background: none;
        box-shadow: none;
        border: 0;
        color: #666666;
        padding: 0 8px 0 10px;
        border-left: solid 1px #ccc;
    }

    #custom-search-input button:hover {
        border: 0;
        box-shadow: none;
        border-left: solid 1px #ccc;
    }

    #custom-search-input .glyphicon-search {
        font-size: 23px;
    }

    #updateMe {
        margin-bottom: 30px;
    }

    .order-details {
        margin-top: 50px;
    }
    .trackOrder{
        margin-top: 20px;
        padding: 15px;
        color: #19AB91;
        font-size: 16px;
        font-weight: bold;
    }


    </style>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <h2>Enter Your Order ID</h2>
            <g:formRemote name="myForm" update="updateMe" on404="alert('not found!')"
                          url="[controller: 'product', action: 'orderDetails']">
                <div id="custom-search-input">
                    <div class="input-group col-md-12">
                        <g:textField class="form-control input-lg" placeholder="Enter OrderID" name="orderid"/>
                        <span class="input-group-btn">

                        </span>
                    </div>
                </div>
            </g:formRemote>
        </div>
    </div>

    <div id="updateMe">
        <g:render template="orderdetails"/>
    </div>
</div>

</body>
</html>