import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_layoutsusertemp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/usertemp.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',15,['default':("UxStore")],-1)
})
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(2)
invokeTag('layoutHead','g',16,[:],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',97,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('img','g',109,['dir':("images"),'file':("shoppingcart.png"),'width':("50"),'height':("50")],-1)
printHtmlPart(6)
expressionOut.print(pageProperty(name: 'meta.nav').equals('HOME') ? 'active' : null)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/product/index'))
printHtmlPart(8)
expressionOut.print(pageProperty(name: 'meta.nav').equals('track') ? 'active' : null)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/product/track'))
printHtmlPart(9)
invokeTag('layoutBody','g',122,[:],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',175,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1465210015069L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
