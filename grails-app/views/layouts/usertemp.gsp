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
    <title><g:layoutTitle default="UxStore"/></title>
    <g:layoutHead/>
    <style type="text/css">
    .footer {
        background-color: #363636;
        color: #fff;
    }

    .footer h4 {

    }

    .footer-wrapper {
        padding: 50px 0 30px 0;
    }

    .right-top-footer {
        text-align: right;
    }

    .header {
        min-height: 100px;
        color: #040442;
        font-size: 50px;
        border-bottom: rgba(255, 188, 0, 0.62);
        /* padding: 12px 0px; */
        background: White;
        border-style: solid;
        /* margin-bottom: 25px; */
        border-width: 0px 0px 3px 0px;
    }
    @media {
        .navbar{
            border-radius: 0px;
            top: -2px;
        }
    }


    .title {
        vertical-align: text-top;
    }
    .menu{
        position: absolute;
        /* margin: 0 auto; */
        left: 0;
        right: 0;
        margin: auto;
    }
    .menuholder {
        min-height: 50px;
    }
    .products{
   /*     text-align: center;
        font-size: 14px;
        color:#ffffff;*/
    }
    .products a{
        text-decoration: none;
        color: #ffffff;
    }
    .products a:hover{
        color: #26a2d3;
        text-decoration: none;
    }
    a{
        color:white;
    }
    a:hover{
        color: #ffffff;
        text-decoration: none;
    }
    .rights{
        text-align: center;
        margin-top: 5px;
        font-size: 10px;
        color: beige;
    }
    .products ul li{
        border-bottom: 1px solid #444444;
        padding: 5px;
        text-decoration: none;
        line-height: 1.5;
        list-style: none;
    }



    </style>
</head>

<body>
<div class="header">
    <div class="container"><span><g:img dir="images" file="shoppingcart.png" width="50" height="50"/></span> <span
            class="title">UX Store</span></div></div>
<div class="menuholder">
<div class="container menu">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li class="${pageProperty(name: 'meta.nav').equals('HOME') ? 'active' : null}"><a
                        href="${createLink(uri: '/product/index')}">HOME</a></li>

                <li><a href="#">OFFERS</a></li>
                <li class="${pageProperty(name: 'meta.nav').equals('track') ? 'active' : null}"><a
                        href="${createLink(uri: '/product/track')}">TRACK ORDER</a></li>
                <li><a href="#">CONTACT US</a></li>
            </ul>
        </div>
    </nav>
</div>

</div>
<g:layoutBody/>


<section class="footer">
    <div class="container footer-wrapper">
        <div class="row top-footer">

            <div class="col-xs-12 col-sm-4  left-top-footer">
                <h4>OUR HEAD OFFICE</h4>
                <address class="address">
                    UBITRIX Inc USA
                    <br>
                    7500 N MOHAWK RD, FOX POINT, WI 53217, USA
                    <br>
                    <a href="#">ubitrix.inc@gmail.com</a>
                </address>

            </div>
            <div class="col-md-2  products">
                <ul>
                    <li><a href="http://uxtracker.ubitrix.us">UxTracker</a></li>
                    <li><a href="http://uxgauge.ubitrix.us">UXGauge</a></li>
                    <li><a href="http://uxsurvey.ubitrix.us">UXSurvey</a></li>
                    <li><a href="http://uxsurvey.ubitrix.us">UXDiabeti</a></li>
                </ul>


        </div>
            <div class="col-md-2 products">
                <ul>

                    <li> <a href="http://uxcardiac.ubitrix.us">UXCardiac</a></li>
                    <li> <a href="http://uxdiaper.ubitrix.us">UXDiaper</a></li>
                </ul>
            </div>


            <div class="col-sm-4 hidden-xs hidden-sm right-top-footer">
                <h4>Support Contact:</h4>
                <address class="address">
                    Call us on: +14147313012
                    <br>
                    <a href="#">Email: support@ubitrix.us</a>
                </address>
            </div>
        </div>
        <p class="rights" >UXTracker &copy; 2016 UBITRIX - ALL RIGHTS RESERVED</p>
    </div>
</section>
</body>
</html>