import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_layoutsadmintemp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/admintemp.gsp" }
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
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(2)
invokeTag('layoutHead','g',17,[:],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',27,['controller':("admin"),'action':("dashboard")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',28,['class':("create"),'controller':("admin"),'action':("addmanager")],2)
printHtmlPart(7)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',29,['controller':("product"),'action':("create")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',34,['controller':("logout")],3)
printHtmlPart(13)
})
invokeTag('ifLoggedIn','sec',34,[:],2)
printHtmlPart(14)
invokeTag('layoutBody','g',34,[:],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1464172602431L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
