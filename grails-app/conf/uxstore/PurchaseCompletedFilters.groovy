package uxstore




class PurchaseCompletedFilters {

    def filters = {
        all(controller: 'paypal', action: '(success|notifyPaypal)') {
            before = {
            }
            after = { Map model ->
                def payment = request.payment
                if(payment && payment.status == org.grails.paypal.Payment.COMPLETE) {

                    def purchase = ProductPurchase.findByPayment(payment)
                    println purchase.completed
                    if ( !purchase.completed ) {
                        purchase.completed = true
                        purchase.save(flush:true,failOnError: true)
                        def custOrder=CustomerOrder.findByOrderId(purchase.orderId)
                        custOrder.payComplete=true
                        custOrder.save(flush:true,failOnError: true)

                    }
                }
            }
            afterView = { Exception e ->
            }
        }
    }
}
