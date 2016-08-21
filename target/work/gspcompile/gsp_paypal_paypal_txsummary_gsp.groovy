import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='paypal', version='0.6.8')
class gsp_paypal_paypal_txsummary_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/paypal-0.6.8/grails-app/views/paypal/_txsummary.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
for( paymentItem in (payment.paymentItems) ) {
printHtmlPart(0)
expressionOut.print(paymentItem.itemName.encodeAsHTML())
printHtmlPart(1)
expressionOut.print(paymentItem.quantity)
printHtmlPart(2)
expressionOut.print(paymentItem.amount * paymentItem.quantity)
printHtmlPart(3)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1342509648000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
