import uxstore.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_product_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('textField','g',6,['class':("form-control"),'name':("name"),'required':(""),'value':(productInstance?.name)],-1)
printHtmlPart(1)
invokeTag('textField','g',13,['class':("form-control"),'name':("description"),'required':(""),'value':(productInstance?.description)],-1)
printHtmlPart(2)
invokeTag('field','g',19,['class':("form-control"),'type':("number"),'name':("unitPrice"),'value':(fieldValue(bean: productInstance, field: 'unitPrice'))],-1)
printHtmlPart(3)
invokeTag('textField','g',26,['class':("form-control"),'name':("category"),'required':(""),'value':(productInstance?.category)],-1)
printHtmlPart(4)
invokeTag('textField','g',57,['class':("form-control"),'name':("productMng"),'required':(""),'value':(productInstance?.productMng)],-1)
printHtmlPart(5)
invokeTag('textField','g',64,['class':("form-control"),'name':("storeMng"),'required':(""),'value':(productInstance?.storeMng)],-1)
printHtmlPart(6)
invokeTag('textField','g',70,['class':("form-control"),'name':("shippingMng"),'required':(""),'value':(productInstance?.shippingMng)],-1)
printHtmlPart(7)
invokeTag('textField','g',76,['class':("form-control"),'name':("packageMng"),'required':(""),'value':(productInstance?.packageMng)],-1)
printHtmlPart(8)
invokeTag('textField','g',81,['class':("form-control"),'name':("unitType"),'required':(""),'value':(productInstance?.unitType)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462753291640L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
