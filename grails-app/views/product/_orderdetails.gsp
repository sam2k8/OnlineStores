<g:javascript src="ProgressTracker.js"/>
<g:javascript src="SampleJson.js"/>

<g:if test="${order == null}">

</g:if>
<g:else>
    <script type="application/javascript">

        var status=${order.status};
        if(status == null){

        }else{
            console.log(status);
            if(status ==1){

                // $( "#tracker1" ).empty();
                $("#tracker1").progressTracker(sampleJson1);
            }else if(status == 2){

                // $( "#tracker1" ).empty();
                $("#tracker1").progressTracker(sampleJson2);
            }else if(status == 3){

                //  $( "#tracker1" ).empty();
                $("#tracker1").progressTracker(sampleJson3);
            }else if(status ==4){
                // $( "#tracker1" ).empty();
                $("#tracker1").progressTracker(sampleJson4);
            }
            else if(status ==5){
                // $( "#tracker1" ).empty();
                $("#tracker1").progressTracker(sampleJson5);
            }
        }
    </script>
    <div class="demoContainer">
        <h2>Your Order Position</h2>
        <div id="tracker1" style="width: 920px">
        </div>
    </div>
    <g:if test="${order.status==5}">


        <div id="trackOrder" class="trackOrder">
            <div> Shipping Service: ${trackObj.shippingService} </div>
            <div> Track No : ${trackObj.trackNo} </div>

        </div>

    </g:if>


    <div class="order-details">
         <table class="table">
            <thead>
            <tr>
                <th>
                    Order ID
                </th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Date </th>
                <th>Payment Status</th>
            </tr>
            </thead>
            <tbody>
            <tr class="success">
                <td>${order.orderId}</td>
                <td>
                    ${order.quantity}
                </td>
                <td>${order.productName}</td>
                <td>${order.modified}</td>
                <td>${order.payComplete}</td>
            </tr>


            </tbody>
        </table>
    </div>
</g:else>
