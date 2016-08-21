import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_admindashboard_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/dashboard.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admintemp")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',38,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
for( _it1234090531 in (orders) ) {
changeItVariable(_it1234090531)
printHtmlPart(7)
if(true && (it.status == 0)) {
printHtmlPart(8)
createTagBody(5, {->
printHtmlPart(9)
expressionOut.print(it.orderId)
printHtmlPart(10)
invokeTag('hiddenField','g',69,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(11)
expressionOut.print(it.productName)
printHtmlPart(11)
expressionOut.print(it.quantity)
printHtmlPart(11)
expressionOut.print(it.payComplete)
printHtmlPart(11)
invokeTag('submitButton','g',74,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 6)
invokeTag('link','g',78,['controller':("admin"),'action':("orderdetails"),'params':([orderId: it.orderId]),'target':("_blank")],6)
printHtmlPart(13)
})
invokeTag('form','g',78,['url':([action: 'updateOrder', controller: 'admin'])],5)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
for( _it962491791 in (orders) ) {
changeItVariable(_it962491791)
printHtmlPart(7)
if(true && (it.status == 1)) {
printHtmlPart(17)
createTagBody(5, {->
printHtmlPart(9)
expressionOut.print(it.orderId)
printHtmlPart(10)
invokeTag('hiddenField','g',104,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(11)
expressionOut.print(it.productName)
printHtmlPart(11)
expressionOut.print(it.quantity)
printHtmlPart(11)
invokeTag('submitButton','g',108,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 6)
invokeTag('link','g',112,['controller':("admin"),'action':("orderdetails"),'params':([orderId: it.orderId]),'target':("_blank")],6)
printHtmlPart(18)
})
invokeTag('form','g',112,['url':([action: 'updateOrder', controller: 'admin'])],5)
printHtmlPart(19)
}
printHtmlPart(15)
}
printHtmlPart(20)
for( _it1752702133 in (orders) ) {
changeItVariable(_it1752702133)
printHtmlPart(7)
if(true && (it.status == 2)) {
printHtmlPart(17)
createTagBody(5, {->
printHtmlPart(9)
expressionOut.print(it.orderId)
printHtmlPart(10)
invokeTag('hiddenField','g',137,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(11)
expressionOut.print(it.productName)
printHtmlPart(11)
expressionOut.print(it.quantity)
printHtmlPart(11)
invokeTag('submitButton','g',141,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 6)
invokeTag('link','g',145,['controller':("admin"),'action':("orderdetails"),'params':([orderId: it.orderId]),'target':("_blank")],6)
printHtmlPart(18)
})
invokeTag('form','g',145,['url':([action: 'updateOrder', controller: 'admin'])],5)
printHtmlPart(19)
}
printHtmlPart(15)
}
printHtmlPart(21)
for( _it631563432 in (orders) ) {
changeItVariable(_it631563432)
printHtmlPart(7)
if(true && (it.status == 3)) {
printHtmlPart(17)
createTagBody(5, {->
printHtmlPart(9)
expressionOut.print(it.orderId)
printHtmlPart(10)
invokeTag('hiddenField','g',169,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(11)
expressionOut.print(it.productName)
printHtmlPart(11)
expressionOut.print(it.quantity)
printHtmlPart(11)
invokeTag('submitButton','g',173,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 6)
invokeTag('link','g',177,['controller':("admin"),'action':("orderdetails"),'params':([orderId: it.orderId]),'target':("_blank")],6)
printHtmlPart(18)
})
invokeTag('form','g',177,['url':([action: 'updateOrder', controller: 'admin'])],5)
printHtmlPart(19)
}
printHtmlPart(15)
}
printHtmlPart(22)
for( _it1822418150 in (orders) ) {
changeItVariable(_it1822418150)
printHtmlPart(7)
if(true && (it.status == 4)) {
printHtmlPart(23)
expressionOut.print(it.orderId)
printHtmlPart(24)
expressionOut.print(it.productName)
printHtmlPart(24)
expressionOut.print(it.quantity)
printHtmlPart(25)
expressionOut.print(it.orderId)
printHtmlPart(26)
createClosureForHtmlPart(27, 5)
invokeTag('link','g',210,['controller':("admin"),'action':("orderdetails"),'params':([orderId: it.orderId]),'target':("_blank")],5)
printHtmlPart(28)
}
printHtmlPart(29)
}
printHtmlPart(30)
})
invokeTag('ifAllGranted','sec',214,['roles':("ROLE_ADMIN")],2)
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
invokeTag('select','g',237,['name':("shippingService"),'class':("form-control"),'id':("shippingService"),'from':(['USPS', 'UPS', 'DHL','FEDEX'])],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',242,['id':("mdlOrderId"),'name':("orderId")],-1)
printHtmlPart(34)
invokeTag('submitButton','g',245,['name':("Done"),'class':("btn btn-default")],-1)
printHtmlPart(35)
})
invokeTag('form','g',246,['url':([action: 'updateTrackNo', controller: 'admin'])],2)
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
for( _it1970073536 in (orders) ) {
changeItVariable(_it1970073536)
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
expressionOut.print(it.orderId)
printHtmlPart(40)
invokeTag('hiddenField','g',270,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(24)
expressionOut.print(it.productName)
printHtmlPart(24)
expressionOut.print(it.quantity)
printHtmlPart(24)
invokeTag('submitButton','g',274,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(41)
})
invokeTag('form','g',274,['url':([action: 'updateOrder', controller: 'admin'])],4)
printHtmlPart(42)
}
printHtmlPart(43)
})
invokeTag('ifAllGranted','sec',276,['roles':("ROLE_ORDERMANGER")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(37)
for( _it1123050106 in (orders) ) {
changeItVariable(_it1123050106)
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
expressionOut.print(it.orderId)
printHtmlPart(40)
invokeTag('hiddenField','g',295,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(24)
expressionOut.print(it.productName)
printHtmlPart(24)
expressionOut.print(it.quantity)
printHtmlPart(24)
invokeTag('submitButton','g',299,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(41)
})
invokeTag('form','g',299,['url':([action: 'updateOrder', controller: 'admin'])],4)
printHtmlPart(42)
}
printHtmlPart(43)
})
invokeTag('ifAllGranted','sec',301,['roles':("ROLE_STOREMANAGER")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(37)
for( _it869358059 in (orders) ) {
changeItVariable(_it869358059)
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
expressionOut.print(it.orderId)
printHtmlPart(40)
invokeTag('hiddenField','g',320,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(24)
expressionOut.print(it.productName)
printHtmlPart(24)
expressionOut.print(it.quantity)
printHtmlPart(24)
invokeTag('submitButton','g',324,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(41)
})
invokeTag('form','g',324,['url':([action: 'updateOrder', controller: 'admin'])],4)
printHtmlPart(42)
}
printHtmlPart(43)
})
invokeTag('ifAllGranted','sec',326,['roles':("ROLE_PACKAGEMANAGER")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(37)
for( _it1969647072 in (orders) ) {
changeItVariable(_it1969647072)
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
expressionOut.print(it.orderId)
printHtmlPart(40)
invokeTag('hiddenField','g',345,['name':("orderId"),'value':(it.orderId)],-1)
printHtmlPart(24)
expressionOut.print(it.productName)
printHtmlPart(24)
expressionOut.print(it.quantity)
printHtmlPart(24)
invokeTag('submitButton','g',349,['class':("btn btn-success btn-block"),'name':("Complete"),'value':("Complete")],-1)
printHtmlPart(41)
})
invokeTag('form','g',349,['url':([action: 'updateOrder', controller: 'admin'])],4)
printHtmlPart(42)
}
printHtmlPart(43)
})
invokeTag('ifAllGranted','sec',351,['roles':("ROLE_SHIPPINGMANAGER")],2)
printHtmlPart(44)
})
invokeTag('captureBody','sitemesh',352,[:],1)
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1464265431023L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
