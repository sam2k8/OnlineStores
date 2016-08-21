import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_adminorderdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/orderdetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admintemp")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(orderDetails.productName)
printHtmlPart(6)
expressionOut.print(orderDetails.quantity)
printHtmlPart(6)
if(true && (orderDetails.payComplete == true)) {
printHtmlPart(7)
}
else {
printHtmlPart(8)
}
printHtmlPart(6)
expressionOut.print(orderDetails.modified)
printHtmlPart(9)
if(true && (shippingDetails == null)) {
printHtmlPart(10)
}
else {
printHtmlPart(11)
expressionOut.print(shippingDetails.name)
printHtmlPart(12)
expressionOut.print(shippingDetails.email)
printHtmlPart(12)
expressionOut.print(shippingDetails.phoneNumber)
printHtmlPart(12)
expressionOut.print(shippingDetails.country)
printHtmlPart(12)
expressionOut.print(shippingDetails.zipCode)
printHtmlPart(12)
expressionOut.print(shippingDetails.address)
printHtmlPart(13)
}
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',74,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1464174726077L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
