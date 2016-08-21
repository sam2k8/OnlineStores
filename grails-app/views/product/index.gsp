<%@ page import="uxstore.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="usertemp">
    <title>Ux Store</title>
    <meta nav="HOME">
    <style>

    .priceval {
        padding: 5px 0px;
        float: right;
        font-size: 20px;
        font-weight: bold;
    }
    .trackdiv{
        min-height: 120px;
        border-bottom: azure;
        padding: 35px 0px;
        background: cadetblue;
        margin-bottom: 25px;
    }
    .trackbtn{
        font-size: 18px;
        padding: 10px 50px;


    }
    .trackbtn:hover{
        /*background-color: #999999 ;*/
    }
    .itemholder{
        margin-bottom: 40px;
        overflow: hidden;
    }
    #banner{
       /* background-image: url("../images/banneruxtracker.png");*/
        width: 100%;
        display: block;
        margin-bottom: 30px;

    }
    .bannar-img{
        display: block;
        min-width:100%;
        max-height:350px;
        width: auto;
        height: auto;
    }
    .prodname{

        padding: 20px;
        position: absolute;
        font-size: 25px;
        color: black;
        line-height: 100%;
        max-width: 170px;
    }
    .prodimg .proddetails{
        padding: 20px;
        position: absolute;
        color: black;
        bottom: 0px;
        left: 0px;
        background: rgba(201, 201, 201, 0.50);
        position: absolute;
        right: 0px;
        margin: 0 auto;
        text-align: center;
        width: auto;
        visibility: hidden;
        padding: 5px 10px;
       /* white-space: nowrap;*/

    }
    .prodimg:hover .proddetails{
        visibility:visible;
        /*transition-delay: 0.2s; *//* delays for 1 second *//*
        -webkit-transition-delay: 0.2s;*/
        -webkit-animation: fadein 2s; /* Safari, Chrome and Opera > 12.1 */
        -moz-animation: fadein 2s; /* Firefox < 16 */
        -ms-animation: fadein 2s; /* Internet Explorer */
        -o-animation: fadein 2s; /* Opera < 12.1 */
        animation: fadein 2s;
    }


    @-webkit-keyframes fadein {
        from { opacity: 0; }
        to   { opacity: 1; }
    }

    @keyframes fadeinout {
        0%,100% { opacity: 0; }
        50% { opacity: 1; }
    }



    .prodimg{
        position: relative;
        overflow: hidden;
        margin-bottom: 10px;
    }

    @media {
        .btn {
            border-radius: 0px;

        }
        .form-control{
            border-radius: 0px;
        }
        .thumbnail{
            border-radius:0px;
            border: none;
            padding: 0px;
            margin-bottom: 0px;

        }
        .thumbnail img{
            /*max-height: 270px;*/

        }

    }
    </style>
</head>

<body>

<div id="banner">
    <g:img class="bannar-img" dir="images" file="banneruxtracker.png" />
</div>
<div class="container">
<div class="itemholder">
        <g:each in="${products}" status="i" var="productInstance">
            <div class="col-md-4 col-sm-4 col-xs-6 ">
                <div class="prodimg">
                <span class="prodname">${productInstance.name}</span>
                <div class="proddetails">${productInstance.description}</div>
                <g:link action="details" params="[id: productInstance.id]" class="thumbnail purple">
                    <img class="avatar" src="${resource(dir: 'images', file: productInstance.image1+'.jpg')}"/></g:link>

                </div>
                <div>
                    <g:link action="details" params="[id: productInstance.id]">
                        <button class="btn btn-warning">BUY NOW</button>
                    </g:link>
                    <span class="priceval">${productInstance.unitPrice}$</span>
                </div>
            </div>
        </g:each>
</div>



</div>

<!--/ footer -->
</body>
</html>
