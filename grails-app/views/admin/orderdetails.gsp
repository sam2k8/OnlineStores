<%--
  Created by IntelliJ IDEA.
  User: Sayem_ubitrix
  Date: 5/25/2016
  Time: 2:39 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="admintemp">
    <title>Details</title>
</head>

<body>
<div class="container">
    <div class="col-md-6">
        <h2>Order Details</h2>

        <div class="col-md-4">
            <div>Product Name</div>

            <div>Quantity</div>

            <div>Payment</div>

            <div>Order Date</div>
        </div>

        <div class="col-md-8">
            <div>${orderDetails.productName}</div>

            <div>${orderDetails.quantity}</div>

            <div><g:if test="${orderDetails.payComplete == true}">Complete</g:if>
                <g:else>Not Complete</g:else></div>

            <div>${orderDetails.modified}</div>
        </div>
    </div>

    <div class="col-md-6">
        <h2>Shipping Details</h2>
        <g:if test="${shippingDetails == null}">
            <h3>Order not completed</h3>
        </g:if>
        <g:else>
            <div class="col-md-4">
                <div>Customer Name</div>

                <div>Email</div>

                <div>Phone</div>

                <div>Country</div>

                <div>Zip Code</div>

                <div>Details Address</div>
            </div>

            <div class="col-md-8">

                <div>${shippingDetails.name}</div>

                <div>${shippingDetails.email}</div>

                <div>${shippingDetails.phoneNumber}</div>

                <div>${shippingDetails.country}</div>

                <div>${shippingDetails.zipCode}</div>

                <div>${shippingDetails.address}</div>

            </div>
        </g:else>
    </div>
</div>
</body>
</html>