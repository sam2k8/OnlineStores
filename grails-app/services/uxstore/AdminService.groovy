package uxstore

import grails.transaction.Transactional

@Transactional
class AdminService {

    def serviceMethod() {

    }
    def findDetails(orderId){
        def details=ShippingAddress.findByOrderId(orderId)

    }
    def updateStatus(orderId){
        def orderObj = CustomerOrder.findByOrderId(orderId)
        if (orderObj) {
            orderObj.status = orderObj.status + 1
            orderObj.save(flush: true, failOnError: true)
        }

    }
}
