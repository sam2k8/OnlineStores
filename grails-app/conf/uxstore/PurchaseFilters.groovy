package uxstore


class PurchaseFilters {

    def filters = {

        all(controller:'paypal', action:'buy') {
            before = {

            }
            after = {  Map model ->

                def item = Product.findByName(request.payment.paymentItems[0].itemName)
                new ProductPurchase(payment: request.payment, product: item, orderId: session.orderId).save()

            }
            afterView = { Exception e ->

            }
        }
    }
}
