package uxstore

import grails.plugin.springsecurity.annotation.Secured
import java.text.DateFormat
import java.text.SimpleDateFormat
import javax.servlet.http.HttpServletRequest
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)

class ProductController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def productService
    @Secured(['permitAll'])

    def index(Integer max) {
        def products =Product.findAll()

        params.max = Math.min(max ?: 10, 100)

        [products:products]

        //respond Product.list(params), model: [productInstanceCount: Product.count()]
    }

    def show(Product productInstance) {
        respond productInstance
    }
    @Secured(['ROLE_ADMIN'])
    def savePicture(){

    }

def FileUploadService

    @Secured(['ROLE_ADMIN'])
    def savePictureToFolder(){
        String baseImageName = "testimage";
// Saving image in a folder assets/channelImage/, in the web-app, with the name: baseImageName
        def downloadedFile = request.getFile( "productPic" )

        String fileUploaded = fileUploadService.uploadFile( downloadedFile, "${baseImageName}.jpg", "/images/" )
        if( fileUploaded ){
            // DO further actions, for example make a db entry for the file name
        }
    }
    @Secured(['ROLE_ADMIN'])
    def create() {
        respond new Product(params)
    }


    private static final okcontents = ['image/png', 'image/jpeg', 'image/gif']

    @Secured(['ROLE_ADMIN'])
    def saveProduct() {
        def productObj = new Product();
        productObj.name = params.name
        productObj.description = params.description

        String baseImageName1 = "image1_" + params.name;
        String baseImageName2 = "image2_" + params.name;
        String baseImageName3 = "image3_" + params.name;

        def image1 = request.getFile('image1')
        def image2 = request.getFile('image2')
        def image3 = request.getFile('image3')

        /*if (!okcontents.contains(image1.getContentType()) && !okcontents.contains(image2.getContentType()) && !okcontents.contains(image3.getContentType())) {
            flash.message = "Image must be one of: ${okcontents}"
            return
        }*/

        fileUploadService.uploadFile( image1, "${baseImageName1}.jpg", "/images/" )
        fileUploadService.uploadFile( image2, "${baseImageName2}.jpg", "/images/" )
        fileUploadService.uploadFile( image3, "${baseImageName3}.jpg", "/images/" )


        productObj.image1 = "image1_" + params.name;
        productObj.image2 = "image2_" + params.name;
        productObj.image3 = "image2_" + params.name;
        productObj.category = params.category
        productObj.productMng = params.productMng
        productObj.shippingMng = params.shippingMng
        productObj.storeMng = params.storeMng
        productObj.unitPrice = params.int('unitPrice')
        productObj.unitType = params.unitType
        productObj.packageMng=params.packageMng
        productObj.save(failOnError: true);
        redirect(action: 'index')
    }

    @Secured(['permitAll'])
    def createOrder() {
        def orderObj = new CustomerOrder();
        orderObj.productName = params.productName
        orderObj.modified = new Date()
        orderObj.quantity = params.int("quantity")
        orderObj.status = 0
        DateFormat df = new SimpleDateFormat("yyyyMMdd  HH:mm");
        String sdt = df.format(new Date(System.currentTimeMillis()));
        def criteria = CustomerOrder.createCriteria()
        def maxId = criteria.get {
            projections {
                max('id')
            }
        }

        def finalOrderId

        if (maxId) {
            def newId = maxId + 1
            def tempOrderId1 = sdt.substring(0, 8)
            finalOrderId = "UX" + tempOrderId1 + newId.toString()
            println finalOrderId

        } else {
            def tempOrderId1 = sdt.substring(0, 8)
            finalOrderId = "UX" + tempOrderId1 + "1"
            println finalOrderId

        }


    /*    sendMail {
            from "sam.x093@gmail.com"
            to "sam.x092@gmail.com"
            subject "hihi"
            body "jijijijiij"
        }*/


        /*def admin=AdminUser.findByUsername("admin")
        println admin.email +"test"
        def subject="New order Created"
        def body= "New order created at order id"+finalOrderId +".Please process further"
        productService.sendEmail(admin.email,subject,body)*/

        orderObj.orderId = finalOrderId
        session.orderId = finalOrderId
        orderObj.save(failOnError: true, flush: true)


    }


    @Secured(['permitAll'])
    def saveShipping() {
        productService.createShippingInfo(params.email,params.name,params.address,params.phoneNumber,params.country,params.state,params.zipCode,session.orderId);
    }
    @Secured(['permitAll'])
    def saveBilling(){
        println "params " + params.name
        productService.createBillingInfo(params.email,params.name,params.address,params.phoneNumber,params.country,params.state,params.zipCode,session.orderId);
    }

    @Secured(['permitAll'])
    def details() {
        def productObj = Product.get(params.id)
        def orderId = 1
        [productObj: productObj, orderId: orderId]
    }

    @Secured(['permitAll'])
    def track() {

    }

    @Secured(['permitAll'])
    def orderDetails() {
        def order=CustomerOrder.findByOrderId(params.orderid)
        println order
        if(order){
            if (order.status==5){
                def trackObj=TrackOrder.findByOrderId(params.orderid)
                render(template: "orderdetails",model: [trackObj:trackObj,order:order])
            }
            else {
                render(template: "orderdetails",model: [order:order])
            }

        }else
        {
            println "failure"
        }
       // render(template: "orderdetails",model: [order:order])
    }


    @Transactional
    @Secured(['permitAll'])
    def save(Product productInstance) {
        if (productInstance == null) {
            notFound()
            return
        }

        if (productInstance.hasErrors()) {
            respond productInstance.errors, view: 'create'
            return
        }

        productInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'product.label', default: 'Product'), productInstance.id])
                redirect productInstance
            }
            '*' { respond productInstance, [status: CREATED] }
        }
    }

    def edit(Product productInstance) {
        respond productInstance
    }

    @Transactional
    @Secured(['permitAll'])
    def update(Product productInstance) {
        if (productInstance == null) {
            notFound()
            return
        }

        if (productInstance.hasErrors()) {
            respond productInstance.errors, view: 'edit'
            return
        }

        productInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
                redirect productInstance
            }
            '*' { respond productInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Product productInstance) {

        if (productInstance == null) {
            notFound()
            return
        }

        productInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'product.label', default: 'Product'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
