<%--
  Created by IntelliJ IDEA.
  User: Sayem
  Date: 1/31/2016
  Time: 5:04 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="admintemp">
    <title>Admin DashBoard</title>

    <script type="text/javascript">
        $(document).ready(function () {

            $(".mdlbtn").click(function(){

                $("#mdlOrderId").val((this.id).substr(3));

               // alert((this.id).substr(3));

            })


        });

    </script>
    <style type="text/css">
    a:hover {
        text-decoration: none;
    }

    #myModal {
        top: 65%;
        left: 30%;
       /* height: 300px;*/
        outline: none;
       /* background: #DFF0D8;*/
    }


    </style>
</head>

<body>
<div class="container">

    <sec:ifAllGranted roles="ROLE_ADMIN">

        <h2>Order Manager</h2>
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Payment Status</th>
                <th>Action</th>
                <th>Details</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <g:if test="${it.status == 0}">

                    <tr>
                        <g:form url="[action: 'updateOrder', controller: 'admin']">
                            <td>${it.orderId}
                                <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                            <td>${it.productName}</td>
                            <td>${it.quantity}</td>
                            <td>${it.payComplete}</td>
                            <td><g:submitButton class="btn btn-success btn-block" name="Complete"
                                                value="Complete"/></td>
                            <td><g:link controller="admin" action="orderdetails" params="[orderId: it.orderId]"
                                        target="_blank"><input type="button" value="Details"
                                                               class="btn btn-success btn-block"></g:link></td>

                        </g:form>
                    </tr>

                </g:if>
            </g:each>
            </tbody>
        </table>

        <h2>Order Manager</h2>
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
                <th>Details</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <g:if test="${it.status == 1}">
                    <tr>
                        <g:form url="[action: 'updateOrder', controller: 'admin']">
                            <td>${it.orderId}
                                <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                            <td>${it.productName}</td>
                            <td>${it.quantity}</td>
                            <td><g:submitButton class="btn btn-success btn-block" name="Complete"
                                                value="Complete"/></td>
                            <td><g:link controller="admin" action="orderdetails" params="[orderId: it.orderId]"
                                        target="_blank"><input type="button" value="Details"
                                                               class="btn btn-success btn-block"></g:link></td>
                        </g:form>
                    </tr>
                </g:if>
            </g:each>
            </tbody>
        </table>

        <h2>Store Manager</h2>

        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
                <th>Details</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <g:if test="${it.status == 2}">
                    <tr>
                        <g:form url="[action: 'updateOrder', controller: 'admin']">
                            <td>${it.orderId}
                                <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                            <td>${it.productName}</td>
                            <td>${it.quantity}</td>
                            <td><g:submitButton class="btn btn-success btn-block" name="Complete"
                                                value="Complete"/></td>
                            <td><g:link controller="admin" action="orderdetails" params="[orderId: it.orderId]"
                                        target="_blank"><input type="button" value="Details"
                                                               class="btn btn-success btn-block"></g:link></td>
                        </g:form>
                    </tr>
                </g:if>
            </g:each>
            </tbody>
        </table>

        <h2>Package Manager</h2>
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
                <th>Details</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <g:if test="${it.status == 3}">
                    <tr>
                        <g:form url="[action: 'updateOrder', controller: 'admin']">
                            <td>${it.orderId}
                                <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                            <td>${it.productName}</td>
                            <td>${it.quantity}</td>
                            <td><g:submitButton class="btn btn-success btn-block" name="Complete"
                                                value="Complete"/></td>
                            <td><g:link controller="admin" action="orderdetails" params="[orderId: it.orderId]"
                                        target="_blank"><input type="button" value="Details"
                                                               class="btn btn-success btn-block"></g:link></td>
                        </g:form>
                    </tr>
                </g:if>
            </g:each>
            </tbody>
        </table>

        <h2>Shipping Manager</h2>
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
                <th>Details</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <g:if test="${it.status == 4}">
                    <tr>

                        <td>${it.orderId}</td>
                        <td>${it.productName}</td>
                        <td>${it.quantity}</td>
                        <td><button type="button" id="mdl${it.orderId}" class="btn btn-success btn-block mdlbtn" data-toggle="modal"
                                    data-target="#myModal">Complete</button>
                        </td>
                        <td><g:link controller="admin" action="orderdetails" params="[orderId: it.orderId]"

                                    target="_blank"><input type="button" value="Details"
                                                           class="btn btn-success btn-block"></g:link></td>

                    </tr>

                </g:if>

            </g:each>
            </tbody>
        </table>

    </sec:ifAllGranted>

    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Modal Header</h4>
                </div>
                <g:form url="[action: 'updateTrackNo', controller: 'admin']">

                    <div class="modal-body form-inline"  role="form">

                       <div class="form-group">
                       <label for="shippingService">Sipping Service</label>
                           <g:select name="shippingService" class="form-control" id="shippingService" from="${['USPS', 'UPS', 'DHL','FEDEX']}"/>
                       </div>
                        <div class="form-group">
                        <label for="trackNo">Track No:</label>
                        <input  name="trackNo" type="text" class="form-control" id="trackNo">
                       </div>
                        <g:hiddenField id="mdlOrderId" name="orderId" />
                        </div>
                       <div class="modal-footer">
                    <g:submitButton name="Done" class="btn btn-default"/>

                </div>
                    </g:form>
            </div>

        </div>
    </div>


    <sec:ifAllGranted roles="ROLE_ORDERMANGER">
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <tr>
                    <g:form url="[action: 'updateOrder', controller: 'admin']">
                        <td>${it.orderId}
                            <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                        <td>${it.productName}</td>
                        <td>${it.quantity}</td>
                        <td><g:submitButton class="btn btn-success btn-block" name="Complete" value="Complete"/></td>
                    </g:form>
                </tr>
            </g:each>
            </tbody>
        </table>
    </sec:ifAllGranted>
    <sec:ifAllGranted roles="ROLE_STOREMANAGER">
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <tr>
                    <g:form url="[action: 'updateOrder', controller: 'admin']">
                        <td>${it.orderId}
                            <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                        <td>${it.productName}</td>
                        <td>${it.quantity}</td>
                        <td><g:submitButton class="btn btn-success btn-block" name="Complete" value="Complete"/></td>
                    </g:form>
                </tr>
            </g:each>
            </tbody>
        </table>
    </sec:ifAllGranted>
    <sec:ifAllGranted roles="ROLE_PACKAGEMANAGER">
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <tr>
                    <g:form url="[action: 'updateOrder', controller: 'admin']">
                        <td>${it.orderId}
                            <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                        <td>${it.productName}</td>
                        <td>${it.quantity}</td>
                        <td><g:submitButton class="btn btn-success btn-block" name="Complete" value="Complete"/></td>
                    </g:form>
                </tr>
            </g:each>
            </tbody>
        </table>
    </sec:ifAllGranted>
    <sec:ifAllGranted roles="ROLE_SHIPPINGMANAGER">
        <table class="table">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${orders}">
                <tr>
                    <g:form url="[action: 'updateOrder', controller: 'admin']">
                        <td>${it.orderId}
                            <g:hiddenField name="orderId" value="${it.orderId}"/></td>
                        <td>${it.productName}</td>
                        <td>${it.quantity}</td>
                        <td><g:submitButton class="btn btn-success btn-block" name="Complete" value="Complete"/></td>
                    </g:form>
                </tr>
            </g:each>
            </tbody>
        </table>
    </sec:ifAllGranted>
</div>

</body>
</html>