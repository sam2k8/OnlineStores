import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_adminaddmanager_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/addmanager.gsp" }
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
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('textField','g',24,['name':("name"),'class':("form-control"),'id':("name"),'placeholder':("Enter Name")],-1)
printHtmlPart(7)
invokeTag('textField','g',31,['name':("username"),'class':("form-control"),'id':("userName"),'placeholder':("Enter Username")],-1)
printHtmlPart(8)
invokeTag('textField','g',37,['name':("email"),'class':("form-control"),'id':("email"),'placeholder':("Enter Email")],-1)
printHtmlPart(9)
invokeTag('passwordField','g',43,['name':("password"),'class':("form-control"),'id':("password"),'placeholder':("Enter Password")],-1)
printHtmlPart(10)
invokeTag('select','g',49,['name':("role"),'id':("role"),'from':(['ROLE_ORDERMANGER', 'ROLE_STOREMANAGER', 'ROLE_PACKAGEMANAGER','ROLE_SHIPPINGMANAGER'])],-1)
printHtmlPart(11)
})
invokeTag('form','g',55,['class':("form-horizontal"),'role':("form"),'url':([action:'savemanager',controller:'admin'])],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462747902106L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
