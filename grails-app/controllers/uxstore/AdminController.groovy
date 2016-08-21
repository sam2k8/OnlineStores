package uxstore

import grails.plugin.springsecurity.annotation.Secured


class AdminController {
    def springSecurityService
    def adminService

    @Secured(['ROLE_ADMIN'])
    def index() {
        render("You are in right place")
    }


    @Secured(['ROLE_ADMIN', 'ROLE_SUPERADMIN', 'ROLE_STOREMANAGER', 'ROLE_ORDERMANGER', 'ROLE_PACKAGEMANAGER', 'ROLE_SHIPPINGMANAGER'])
    def dashboard() {
        def roles = springSecurityService.getPrincipal().getAuthorities()
        def orderList

        for (def role in roles) {
            if (role.getAuthority() == "ROLE_ADMIN") {
                orderList = CustomerOrder.findAll()
            } else if (role.getAuthority() == "ROLE_ORDERMANGER") {
                orderList = CustomerOrder.findAllByStatus(1)
                [orders: orderList]
            } else if (role.getAuthority() == "ROLE_STOREMANAGER") {
                orderList = CustomerOrder.findAllByStatus(2)
                [orders: orderList]
            } else if (role.getAuthority() == "ROLE_PACKAGEMANAGER") {
                orderList = CustomerOrder.findAllByStatus(3)
                [orders: orderList]
            } else if (role.getAuthority() == "ROLE_SHIPPINGMANAGER") {
                orderList = CustomerOrder.findAllByStatus(4)
                [orders: orderList]
            }

        }

        [orders: orderList]

    }

    @Secured(['permitAll'])
    def updateOrder() {
        println params.orderId
        def orderObj = CustomerOrder.findByOrderId(params.orderId)
        if (orderObj) {
            orderObj.status = orderObj.status + 1
            orderObj.save(flush: true, failOnError: true)
        }
        redirect(action: 'dashboard')
    }

    @Secured(['ROLE_ADMIN'])
    def addmanager() {

    }

    @Secured(['ROLE_ADMIN'])
    def orderdetails() {

        def shippingDetails = ShippingAddress.findByOrderId(params.orderId)

        def orderDetails = CustomerOrder.findByOrderId(params.orderId)

        [shippingDetails: shippingDetails, orderDetails: orderDetails]

    }

    @Secured(['ROLE_ADMIN'])
    def savemanager() {
        def user = new AdminUser()
        def role = AdminRole.findByAuthority(params.role)
        if (role) {

        } else {
            role.authority = params.role
            role.save(flush: true, failOnError: true)
        }
        user.name = params.name
        user.username = params.username
        user.email = params.email
        user.password = params.password
        user.save(flush: true, failOnError: true)
        AdminUserAdminRole.create(user, role)
        render("success")

    }

    @Secured(['ROLE_ADMIN'])
    def shipingmanger() {


    }

    @Secured(['permitAll'])
    def updateTrackNo() {

        println params.orderId
        def trackObj = new TrackOrder()
        trackObj.orderId = params.orderId
        trackObj.shippingService = params.shippingService
        trackObj.trackNo = params.trackNo
        trackObj.save(flash: true, failOnError: true);

        adminService.updateStatus(params.orderId)

        redirect(action: 'dashboard')

    }
    @Secured(['permitAll'])
    def getTrackOrder(){
/*        println params.orderId
        def trackObj=TrackOrder.findByOrderId(params.orderId)
        if(trackObj){
            render "  <div> Shipping Service : ${trackObj.shippingService} </div>\n" +
                    "  <div> Track ID :  ${trackObj.trackNo}</div>"
        }*/


    }
}
