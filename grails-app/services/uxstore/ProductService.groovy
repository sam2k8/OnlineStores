package uxstore

import grails.transaction.Transactional

@Transactional
class ProductService {

    def serviceMethod() {

    }

    def sendEmail(def to, def subject,def body){

        println to + subject + body +"test 2"
        sendMail {
            to "sam.x092@gmail.com"
            subject subject
            body body
        }

    }
    def createShippingInfo(email,name,address,phoneNumber,country,state,zipCode,orderId){
        def shippingObj = new ShippingAddress()
        shippingObj.email = email
        shippingObj.name = name
        shippingObj.address = address
        shippingObj.phoneNumber = phoneNumber
        shippingObj.country = country
        shippingObj.state = state
        shippingObj.zipCode = zipCode
        shippingObj.orderId = orderId
        shippingObj.save(flush: true, failOnError: true);
    }

    def createBillingInfo(email,name,address,phoneNumber,country,state,zipCode,orderId){
        def billingObj=new BillingAddress()
        billingObj.email = email
        billingObj.name = name
        billingObj.address = address
        billingObj.phoneNumber = phoneNumber
        billingObj.country = country
        billingObj.state = state
        billingObj.zipCode = zipCode
        billingObj.orderId = orderId
        billingObj.save(flush: true, failOnError: true);

    }

}
