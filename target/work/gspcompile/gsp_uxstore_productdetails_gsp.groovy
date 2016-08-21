import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_productdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/details.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(productObj.name)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("usertemp")],-1)
printHtmlPart(3)
invokeTag('createLinkTo','g',13,['dir':("css"),'file':("style.css")],-1)
printHtmlPart(4)
invokeTag('createLinkTo','g',14,['dir':("css"),'file':("orderprocess.css")],-1)
printHtmlPart(5)
expressionOut.print(productObj.unitPrice)
printHtmlPart(6)
invokeTag('javascript','g',227,['src':("countries3.js")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',227,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(productObj.image1)
printHtmlPart(9)
expressionOut.print(productObj.image1)
printHtmlPart(10)
expressionOut.print(productObj.image2)
printHtmlPart(11)
expressionOut.print(productObj.image2)
printHtmlPart(10)
expressionOut.print(productObj.image3)
printHtmlPart(11)
expressionOut.print(productObj.image3)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
expressionOut.print(productObj.name)
printHtmlPart(14)
expressionOut.print(productObj.description)
printHtmlPart(15)
expressionOut.print(productObj.unitPrice)
printHtmlPart(16)
expressionOut.print(productObj.unitPrice)
printHtmlPart(17)
invokeTag('hiddenField','g',334,['name':("productName"),'value':(productObj.name)],-1)
printHtmlPart(18)
invokeTag('submitButton','g',342,['id':("shippingEntry"),'class':(" form-control btn nextbtn btn-primary"),'name':("Continue Purchase")],-1)
printHtmlPart(19)
})
invokeTag('formRemote','g',343,['class':("form-horizontal lp-form"),'role':("form"),'name':("myForm"),'on404':("alert('not found!')"),'update':("updateMe"),'url':([controller: 'product', action: 'createOrder'])],2)
printHtmlPart(20)
invokeTag('hiddenField','g',349,['name':("totalPrice"),'value':(""),'id':("totalPrice")],-1)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('textField','g',362,['class':("form-control"),'id':("name"),'placeholder':("Your Name *"),'name':("name"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(23)
invokeTag('textField','g',368,['class':("form-control"),'id':("email"),'name':("email"),'placeholder':("Enter Email *"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(24)
invokeTag('textField','g',378,['class':("form-control"),'id':("phone"),'name':("phoneNumber"),'placeholder':("Enter Phone Number*"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(23)
invokeTag('select','g',381,['class':("form-control"),'onchange':("print_state('state', this.selectedIndex);"),'id':("country"),'name':("country"),'from':("")],-1)
printHtmlPart(25)
invokeTag('select','g',390,['class':("form-control"),'name':("state"),'id':("state"),'noSelection':(['':'Select State']),'from':("")],-1)
printHtmlPart(26)
invokeTag('textField','g',395,['class':("form-control"),'id':("zipCode"),'name':("zipCode"),'placeholder':("Zip Code*")],-1)
printHtmlPart(23)
invokeTag('textField','g',407,['class':("form-control"),'id':("address"),'name':("address"),'placeholder':("Detail Address")],-1)
printHtmlPart(27)
invokeTag('submitButton','g',414,['id':("shippingForm"),'class':("form-control btn btn-primary"),'name':("Continue Purchase")],-1)
printHtmlPart(28)
})
invokeTag('formRemote','g',415,['class':("form-horizontal lp-form"),'role':("form"),'name':("myForm"),'on404':("alert('not found!')"),'update':("updateMe"),'url':([controller: 'product', action: 'saveShipping'])],2)
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
invokeTag('hiddenField','g',431,['class':("billingName"),'name':("name"),'value':("")],-1)
printHtmlPart(31)
invokeTag('hiddenField','g',433,['class':("billingEmail"),'name':("email"),'value':("")],-1)
printHtmlPart(32)
invokeTag('hiddenField','g',439,['class':("billingPhone"),'name':("phoneNumber"),'value':("")],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',442,['class':("billingAddress"),'name':("address"),'value':("")],-1)
printHtmlPart(34)
invokeTag('hiddenField','g',446,['class':("billingZip"),'name':("zipCode"),'value':("")],-1)
printHtmlPart(35)
invokeTag('hiddenField','g',450,['class':("billingCountry"),'name':("country"),'value':("")],-1)
printHtmlPart(36)
invokeTag('hiddenField','g',457,['class':("billingState"),'name':("state"),'value':("")],-1)
printHtmlPart(37)
invokeTag('submitButton','g',466,['id':("shippingForm"),'class':("billing-form form-control btn btn-primary"),'name':("Continue Purchase")],-1)
printHtmlPart(38)
})
invokeTag('formRemote','g',468,['class':("form-horizontal lp-form"),'role':("form"),'name':("myForm"),'on404':("alert('not found!')"),'update':("updateMe"),'url':([controller: 'product', action: 'saveBilling'])],2)
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
invokeTag('textField','g',477,['class':("form-control"),'id':("name"),'placeholder':("Your Name *"),'name':("name"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(41)
invokeTag('textField','g',481,['class':("form-control"),'id':("email"),'name':("email"),'placeholder':("Enter Email *"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(42)
invokeTag('textField','g',487,['class':("form-control"),'id':("phone"),'name':("phoneNumber"),'placeholder':("Enter Phone Number*"),'tabindex':("3"),'required':("")],-1)
printHtmlPart(41)
invokeTag('select','g',491,['class':("form-control"),'onchange':("print_state('state1', this.selectedIndex);"),'id':("country1"),'name':("country"),'from':("")],-1)
printHtmlPart(43)
invokeTag('select','g',497,['class':("form-control"),'name':("state"),'id':("state1"),'from':("")],-1)
printHtmlPart(44)
invokeTag('textField','g',501,['class':("form-control"),'id':("zipCode"),'name':("zipCode"),'placeholder':("Zip Code")],-1)
printHtmlPart(41)
invokeTag('textField','g',507,['class':("form-control"),'id':("address"),'name':("address"),'placeholder':("Detail Address")],-1)
printHtmlPart(45)
invokeTag('submitButton','g',517,['id':("shippingForm"),'class':("billing-form form-control btn btn-primary"),'name':("Continue Purchase")],-1)
printHtmlPart(46)
})
invokeTag('formRemote','g',517,['class':("form-horizontal lp-form"),'role':("form"),'name':("myForm"),'on404':("alert('not found!')"),'update':("updateMe"),'url':([controller: 'product', action: 'saveBilling'])],2)
printHtmlPart(47)
invokeTag('button','paypal',539,['itemName':(productObj.name),'itemId':(productObj.id),'itemNumber':(productObj.name),'discountAmount':(0),'amount':(productObj.unitPrice),'buyerId':(orderId)],-1)
printHtmlPart(48)
invokeTag('javascript','g',542,['src':("jqzoom.js")],-1)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',542,[:],1)
printHtmlPart(49)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1465213458058L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
