import uxstore.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uxstore_productshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'product.label', default: 'Product'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (productInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("product.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(productInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.unitPrice)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("product.unitPrice.label"),'default':("Unit Price")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(productInstance),'field':("unitPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.image1)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("product.image1.label"),'default':("Image1")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.category)) {
printHtmlPart(21)
invokeTag('message','g',53,['code':("product.category.label"),'default':("Category")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',55,['bean':(productInstance),'field':("category")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.description)) {
printHtmlPart(23)
invokeTag('message','g',62,['code':("product.description.label"),'default':("Description")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',64,['bean':(productInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.image2)) {
printHtmlPart(25)
invokeTag('message','g',71,['code':("product.image2.label"),'default':("Image2")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.image3)) {
printHtmlPart(26)
invokeTag('message','g',78,['code':("product.image3.label"),'default':("Image3")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.image4)) {
printHtmlPart(27)
invokeTag('message','g',85,['code':("product.image4.label"),'default':("Image4")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.productMng)) {
printHtmlPart(28)
invokeTag('message','g',92,['code':("product.productMng.label"),'default':("Product Mng")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',94,['bean':(productInstance),'field':("productMng")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.shippingMng)) {
printHtmlPart(30)
invokeTag('message','g',101,['code':("product.shippingMng.label"),'default':("Shipping Mng")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',103,['bean':(productInstance),'field':("shippingMng")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.storeMng)) {
printHtmlPart(32)
invokeTag('message','g',110,['code':("product.storeMng.label"),'default':("Store Mng")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',112,['bean':(productInstance),'field':("storeMng")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.unitType)) {
printHtmlPart(34)
invokeTag('message','g',119,['code':("product.unitType.label"),'default':("Unit Type")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',121,['bean':(productInstance),'field':("unitType")],-1)
printHtmlPart(16)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
invokeTag('message','g',129,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',129,['class':("edit"),'action':("edit"),'resource':(productInstance)],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',130,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',132,['url':([resource:productInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',134,[:],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1449473982354L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
