import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_product_orderdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/_orderdetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('javascript','g',1,['src':("ProgressTracker.js")],-1)
printHtmlPart(0)
invokeTag('javascript','g',2,['src':("SampleJson.js")],-1)
printHtmlPart(1)
if(true && (order == null)) {
printHtmlPart(1)
}
else {
printHtmlPart(2)
expressionOut.print(order.status)
printHtmlPart(3)
if(true && (order.status==5)) {
printHtmlPart(4)
expressionOut.print(trackObj.shippingService)
printHtmlPart(5)
expressionOut.print(trackObj.trackNo)
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(order.orderId)
printHtmlPart(8)
expressionOut.print(order.quantity)
printHtmlPart(9)
expressionOut.print(order.productName)
printHtmlPart(10)
expressionOut.print(order.modified)
printHtmlPart(10)
expressionOut.print(order.payComplete)
printHtmlPart(11)
}
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1464602842676L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
