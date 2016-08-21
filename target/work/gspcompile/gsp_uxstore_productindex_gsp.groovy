import uxstore.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_productindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("usertemp")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'nav':("HOME")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',128,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('img','g',133,['class':("bannar-img"),'dir':("images"),'file':("banneruxtracker.png")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( productInstance in (products) ) {
printHtmlPart(7)
expressionOut.print(productInstance.name)
printHtmlPart(8)
expressionOut.print(productInstance.description)
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: productInstance.image1+'.jpg'))
printHtmlPart(11)
})
invokeTag('link','g',143,['action':("details"),'params':([id: productInstance.id]),'class':("thumbnail purple")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',149,['action':("details"),'params':([id: productInstance.id])],3)
printHtmlPart(14)
expressionOut.print(productInstance.unitPrice)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',161,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1465375878296L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
