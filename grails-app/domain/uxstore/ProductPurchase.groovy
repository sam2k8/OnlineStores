package uxstore
import org.grails.paypal.Payment
class ProductPurchase {
    Product product
    Payment payment
    String orderId
    boolean completed = false

    static constraints = {
    }
}
