package uxstore

class BillingAddress {

    String name
    String phoneNumber
    String email
    String address
    String country
    String state
    String zipCode
    String orderId

    static constraints = {
        name  blank: false ,nullable: false
        email email: true, blank: false
        phoneNumber blank: false,nullable: false

    }
}
