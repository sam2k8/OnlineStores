<%--
  Created by IntelliJ IDEA.
  User: Sayem
  Date: 12/9/2015
  Time: 11:32 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${productObj.name}</title>
    <meta name="layout" content="usertemp">
    <link rel="stylesheet" type="text/css" href="<g:createLinkTo dir='css' file='style.css'/>">
    <link rel="stylesheet" type="text/css" href="<g:createLinkTo dir='css' file='orderprocess.css'/>">
    %{--  <g:javascript src="progressbar.js"/>--}%
    <script type="text/javascript">
        $(document).ready(function () {

            $("#bzoom").zoom({
                zoom_area_width: 400
            });

            $("#message").hide();
            $("#shippingForm").click(function () {
                if ($("name").value == "") {
                    alert("name field empty");

                }

            });
            $("#shipping").hide();
            $("#billing").hide();
            $("#completePayment").hide();

            $("#quantity").keyup(function () {
                this.value = this.value.replace(/[^0-9\.]/g, '');
            });
            $("#shippingEntry").click(function () {

                if ($.trim($("#quantity").val()) != "") {
                    $("#shipping").show();
                    /*$".entypo-flight").addClass("blue")*/
                    $('.entypo-flight').addClass('blue');
                    $('#arrow1').addClass('blue');
                    $("#chooseProduct").hide();
                    var itemPrice =${productObj.unitPrice};
                    console.log(itemPrice)
                    var quantity = $("#quantity").val();
                    console.log(quantity)
                    var totalPrice = quantity * itemPrice;
                    /*alert(totalPrice);*/
                    $("#totalPrice").val(totalPrice);
                    $("#amount").val(totalPrice);
                }
            });

            $("#shippingForm").click(function (e) {


                if ($("#name").val() == '' || $("#email").val() == '' || $("#address").val() == '' || $("#country").val() == '' || $("#zipCode").val() == '') {
                    $("#message").text("* Please enter all information")
                    $("#message").show();
                    e.preventDefault();
                }
                else {
                    $('.entypo-doc-text').addClass('blue');
                    $('#arrow2').addClass('blue');
                    $("#shipping").hide();
                    var totalPrice = $("#shipping").val();
                    //alert($("#name").val());
                    $("#billingFrom").hide();
                    $(".billingName").attr("value", $("#name").val());
                    $(".billingEmail").attr("value", $("#email").val());
                    $(".billingPhone").attr("value", $("#phone").val());
                    $(".billingAddress").attr("value", $("#address").val());
                    $(".billingCountry").attr("value", $("#country").val());
                    $(".billingZip").attr("value", $("#zipCode").val());
                    $(".billingState").attr("value", $("#state").val());

                    $(".billingName").text($("#name").val());
                    $(".billingEmail").text($("#email").val());
                    $(".billingPhone").text($("#phone").val());
                    $(".billingAddress").text($("#address").val());
                    $(".billingCountry").text($("#country").val());
                    $(".billingZip").text($("#zipCode").val());
                    $(".billingState").text($("#state").val());
                    $("#message").hide();
                    $("#billing").show();
                    $("#billingFrom").hide()
                    // $("#completePayment").show();
                }


            });
            $(".billing-form").click(function (e) {


                if ($(".billingName").text() == '' || $(".billingEmail").text() == '' || $(".billingPhone").text() == '' || $(".billingCountry").text() == '' || $(".billingZip").text() == '') {
                    $("#message1").text("Please enter all information");
                    //  alert((".billingName").text());
                    $("#message1").show();
                    e.preventDefault();
                }
                else {
                    $('.entypo-credit-card').addClass('blue');
                    $('#arrow3').addClass('blue');
                    $("#billing").hide();
                    var totalPrice = $("#shipping").val();
                    //alert($("#name").val());
                    $("#buyerName").text($("#name").val());
                    $("#buyerEmail").text($("#email").val());
                    $("#buyerAddress").text($("#address").val());
                    $("#buyerCountry").text($("#country").val());
                    $("#buyerZip").text($("#zipCode").val());
                    $("#message").hide();
                    $("#completePayment").show();
                }


            });


            $("#checkBox").change(function () {
                if (this.checked) {
                    $("#billingFrom").hide();
                    $("#billingInfo").show();
                    $("#billingName").text($("#name").val());
                    $("#billingEmail").text($("#email").val());
                    $("#billingAddress").text($("#address").val());
                    $("#billingCountry").text($("#country").val());
                    $("#billingZip").text($("#zipCode").val());

                }
                else {
                    $("#billingFrom").show();
                    $("#billingInfo").hide();

                }
            });


        });


    </script>
    <style type="text/css">
    .display_div {
        overflow: hidden;
        min-height: 550px;
    }

    #orderinfo {
        font-size: 25px;
        font-weight: bold;
    }
    .title{
        font-size: 20px;
    }

    .qtn {
        font-size: 16px;
    }

    .qtninput {
        width: 100%;
        padding: 10px 0px 10px 10px
    }

    #finalPayment {
        margin-top: 30px;
    }

    .lp-form .form-group .btn:hover {
        background-color: #3f788a;
        color: #FFFFFF;
    }

    .lp-form .form-group .btn {
        border-color: #4889AF;
    }
    .btn{
        color: #ffffff;
        background-color:#3f788a;
    }

    #chooseProduct ,#billing,#shipping,#completePayment {
        padding: 30px;
    }
    #message{
        color: red;
    }
    .details span {
        color: #989696;
    }

    .details p {
        color: #000000;
    }
    .title span{

        font-size: 25px;
        color:#989696;
    }

    input[type=number] {
       /* height: 40px;*/
        line-height: 30px;
        font-size: 16px;
        padding: 0 8px;
    }

    input[type=number]::-webkit-inner-spin-button {
        -webkit-appearance: none;
        cursor: pointer;
        display: block;
        width: 8px;
        color: #333;
        text-align: center;
        position: relative;
    }

    input[type=number]:hover::-webkit-inner-spin-button {
        background: #eee url('http://i.stack.imgur.com/YYySO.png') no-repeat 50% 50%;
        width: 16px;
        height: 40px;
        padding: 4px;
        position: relative;
        right: 4px;
        border-radius: 28px;
    }

    </style>

    <g:javascript src="countries3.js"/>
</head>

<body>

<div class="container">
    <div class="silderholder">
        <div class="process-flow">
            <figure class="step">
                <span class="entypo-basket blue"></span>
                <figcaption>Choose Product</figcaption>
            </figure>

            <div class="arrow">
                <span id="arrow1" class="entypo-forward"></span>
            </div>
            <figure class="step">
                <span class="entypo-flight"></span>
                <figcaption>Enter Shipping Info</figcaption>
            </figure>

            <div class="arrow">
                <span id="arrow2" class="entypo-forward"></span>
            </div>
            <figure class="step">
                <span class="entypo-doc-text"></span>
                <figcaption>Confirm  Purchase</figcaption>
            </figure>

            <div class="arrow">
                <span id="arrow3" class="entypo-forward"></span>
            </div>
            <figure class="step">
                <span class="entypo-credit-card"></span>
                <figcaption>Confirm  Purchase</figcaption>
            </figure>
        </div>
    </div>
</div>

<div class="container">

    <div id="chooseProduct">

        <div class="  display_div">
            <div class="bzoom_wrap">
                <ul id="bzoom">
                    <li>
                        <img class="bzoom_thumb_image"
                             src="/uxstore/images/${productObj.image1}.jpg"/>
                        <img class="bzoom_big_image"
                             src="/uxstore/images/${productObj.image1}.jpg"/>
                    </li>
                    <li>
                        <img class="bzoom_thumb_image"
                             src="/uxstore//images/${productObj.image2}.jpg"/>
                        <img class="bzoom_big_image"
                             src="/uxstore//images/${productObj.image2}.jpg"/>
                    </li>
                    <li>
                        <img class="bzoom_thumb_image"
                             src="/uxstore//images/${productObj.image3}.jpg"/>
                        <img class="bzoom_big_image"
                             src="/uxstore//images/${productObj.image3}.jpg"/>
                    </li>

                </ul>
            </div>

            <div class="col-md-offset-6 col-md-6" id="orderinfo">
                <g:formRemote class="form-horizontal lp-form" role="form" name="myForm" on404="alert('not found!')"
                              update="updateMe"
                              url="[controller: 'product', action: 'createOrder']">
                    <div class="">
                        <div class="form-group">
                            <div class="col-xs-12 details">
                                <h3>${productObj.name}</h3>
                                <span>By Ubitrix</span>

                                <p>${productObj.description}</p>
                                <span>Shipping : Free</span>
                                <br>
                                <span>Availability : US,Canada</span>
                            </div>

                        </div>

                        <div class="form-group title">
                            <div class="col-xs-12">
                                <span id="price">Price : ${productObj.unitPrice}$</span>
                                <br>
                                <span id="sale">Sale : ${productObj.unitPrice}$</span>
                            </div>
                        </div>

                            <div>Quantity :</div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <input class="form-control" id="quantity" type="number" name="quantity"
                                       min="0" max="500" step="1" value="1">
                            </div>

                        </div>

                        <g:hiddenField name="productName" value="${productObj.name}"/>

                        <div class="form-group">
                            <div class="col-md-offset-6 col-xs-6">
                                <g:submitButton id="shippingEntry" class=" form-control btn nextbtn btn-primary"
                                                name="Continue Purchase"/>

                            </div>

                        </div>
                    </div>
                </g:formRemote>

            </div>

        </div>

        %{--<div class="col-md-5" id="orderinfo">
            <g:formRemote class="form-horizontal lp-form" role="form" name="myForm" on404="alert('not found!')"
                          update="updateMe"
                          url="[controller: 'product', action: 'createOrder']">
                <div class="">
                    <div class="form-group title">
                        <div class="col-xs-12">
                            ${productObj.name}
                        </div>
                    </div>

                    <div class="form-group title">
                        <div class="col-xs-12" >
                           <span id="price">${productObj.unitPrice}</span>$
                        </div>
                    </div>

                    <div class="form-group title">
                        <div class="col-xs-12">
                            Quantity :
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-12">
                            <input class="form-control" id="quantity" type="number" name="quantity"
                                   min="0" max="500" step="1" value="1">
                        </div>

                    </div>

                    <g:hiddenField name="productName" value="${productObj.name}"/>

                    <div class="form-group">
                        <div class="col-md-offset-6 col-xs-6">
                            <g:submitButton id="shippingEntry" class=" form-control btn nextbtn btn-primary"
                                            name="Continue Purchase"/>

                        </div>

                    </div>
                </div>
            </g:formRemote>

        </div>--}%

    </div>



    <g:hiddenField name="totalPrice" value="" id="totalPrice"/>

    <div id="shipping">

        <g:formRemote class="form-horizontal lp-form" role="form" name="myForm" on404="alert('not found!')"
                      update="updateMe"
                      url="[controller: 'product', action: 'saveShipping']">
            <div class="form-group">
                <div class="col-xs-6">
                    <g:textField class="form-control" id="name" placeholder="Your Name *" name="name" tabindex="3"
                                 required=""/>
                </div>

                <div class="col-xs-6">
                    <g:textField class="form-control" id="email" name="email" placeholder="Enter Email *" tabindex="3"
                                 required=""/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-xs-6">
                    <g:textField class="form-control" id="phone" name="phoneNumber"
                                 placeholder="Enter Phone Number*" tabindex="3" required=""/>
                </div>

                <div class="col-xs-6">
                    <g:select class="form-control" onchange="print_state('state', this.selectedIndex);" id="country"
                              name="country" from=""/>
                    <script language="javascript">print_country("country");</script>
                </div>
            </div>

            <div class="form-group">
                <div class="col-xs-3">
                    <g:select class="form-control" name="state" id="state" noSelection="['':'Select State']" from=""/>
                </div>

                <div class="col-xs-3">
                    <g:textField class="form-control" id="zipCode" name="zipCode" placeholder="Zip Code*"/>
                </div>

                <div class="col-xs-6">
                    <g:textField class="form-control" id="address" name="address" placeholder="Detail Address"/>
                </div>

            </div>

            <div class="input-group col-sm-10">
                <span id="message"></span>
            </div>
            <br>

            <div class="form-group">
                <div class="col-md-offset-9 col-sm-3">
                    <g:submitButton id="shippingForm" class="form-control btn btn-primary" name="Continue Purchase"/>
                </div>
            </div>
        </g:formRemote>

    </div>

    <div id="billing">

        <label class="checkbox-inline"><input id="checkBox" type="checkbox" value=""
                                              checked="checked">My billing info as same as my shipping info</label>

        <div id="billingInfo">
            <g:formRemote class="form-horizontal lp-form" role="form" name="myForm" on404="alert('not found!')"
                          update="updateMe"
                          url="[controller: 'product', action: 'saveBilling']">

                <div><label>Name :</label> <span class="billingName"></span></div>
                <g:hiddenField class="billingName" name="name" value=""/>

                <div><label>Email :</label> <span class="billingEmail"></span></div>
                <g:hiddenField class="billingEmail" name="email" value=""/>
                <div><label>Phone Number :</label> <span class="billingPhone"></span></div>
                <g:hiddenField class="billingPhone" name="phoneNumber" value=""/>

                <div><label>Address :</label> <span class="billingAddress"></span></div>
                <g:hiddenField class="billingAddress" name="address" value=""/>

                <div><label>Zip Code :</label> <span class="billingZip"></span></div>
                <g:hiddenField class="billingZip" name="zipCode" value=""/>

                <div><label>Country :</label> <span class="billingCountry"></span></div>
                <g:hiddenField class="billingCountry" name="country" value=""/>
                <div><label>State :</label> <span class="billingState"></span></div>
                <g:hiddenField class="billingState" name="state" value=""/>

                <div class="form-group">
                    <div class="col-md-offset-9 col-sm-3">
                        <g:submitButton id="shippingForm" class="billing-form form-control btn btn-primary"
                                        name="Continue Purchase"/>
                    </div>
                </div>

            </g:formRemote>

        </div>

        <div id="billingFrom">
            <g:formRemote class="form-horizontal lp-form" role="form" name="myForm" on404="alert('not found!')"
                          update="updateMe"
                          url="[controller: 'product', action: 'saveBilling']">
                <div class="form-group">
                    <div class="col-xs-6">
                        <g:textField class="form-control" id="name" placeholder="Your Name *" name="name" tabindex="3"
                                     required=""/>
                    </div>

                    <div class="col-xs-6">
                        <g:textField class="form-control" id="email" name="email" placeholder="Enter Email *"
                                     tabindex="3" required=""/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-xs-6">
                        <g:textField class="form-control" id="phone" name="phoneNumber"
                                     placeholder="Enter Phone Number*" tabindex="3" required=""/>
                    </div>

                    <div class="col-xs-6">
                        <g:select class="form-control" onchange="print_state('state1', this.selectedIndex);"
                                  id="country1"
                                  name="country" from=""/>
                        <script language="javascript">print_country("country1");</script>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-xs-3">
                        <g:select class="form-control" name="state" id="state1" from=""/>
                    </div>

                    <div class="col-xs-3">
                        <g:textField class="form-control" id="zipCode" name="zipCode" placeholder="Zip Code"/>
                    </div>

                    <div class="col-xs-6">
                        <g:textField class="form-control" id="address" name="address" placeholder="Detail Address"/>
                    </div>

                </div>

                <div class="input-group col-sm-10">
                    <span id="message1"></span>
                </div>
                <br>

                <div class="form-group">
                    <div class="col-md-offset-9 col-sm-3">
                        <g:submitButton id="shippingForm" class="billing-form form-control btn btn-primary"
                                        name="Continue Purchase"/>
                    </div>
                </div>
            </g:formRemote>
        </div>

    </div>

    <div id="completePayment">

        <div class="form-horizontal lp-form">

            <div class="col-md-offset-4 col-md-4" style="overflow: hidden;">
                <div><label>Name :</label> <span id="buyerName"></span></div>

                <div><label>Email :</label> <span id="buyerEmail"></span></div>

                <div><label>Address :</label> <span id="buyerAddress"></span></div>

                <div><label>Zip Code :</label> <span id="buyerZip"></span></div>

                <div><label>Country :</label> <span id="buyerCountry"></span></div>

                <div id="finalPayment">

                    <paypal:button
                            itemName="${productObj.name}"
                            itemId="${productObj.id}"
                            itemNumber="${productObj.name}"
                            discountAmount="${0}"
                            amount="${productObj.unitPrice}"
                            buyerId="${orderId}"/>
                </div>
            </div>

        </div>
    </div>

</div>

<g:javascript src="jqzoom.js"/>
</body>
</html>