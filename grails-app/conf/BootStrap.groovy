import uxstore.AdminRole
import uxstore.AdminUser
import uxstore.AdminUserAdminRole
import org.codehaus.groovy.grails.commons.ApplicationAttributes

class BootStrap {

    def init = { servletContext ->

//       def ctx=servletContext.getAttribute(
//                ApplicationAttributes.APPLICATION_CONTEXT)
//        def dataSourceUnproxied  = ctx.dataSource
//
//        dataSourceUnproxied .setMinEvictableIdleTimeMillis(1000 * 60 * 30)
//        dataSourceUnproxied .setTimeBetweenEvictionRunsMillis(1000 * 60 * 30)
//        dataSourceUnproxied .setNumTestsPerEvictionRun(3)
//
//        dataSourceUnproxied .setTestOnBorrow(true)
//        dataSourceUnproxied .setTestWhileIdle(false)
//        dataSourceUnproxied .setTestOnReturn(false)
//        dataSourceUnproxied .setValidationQuery("SELECT 1")




        AdminUser admin = new AdminUser(name:'Admin',email:'sam.x092@gmail.com',username:'admin', password:'admin', enabled:true).save()
        AdminUser sayem = new AdminUser(name:'Sayem',email:'sam.x092@gmail.com',username:'sayem', password:'sayem', enabled:true).save()
        AdminUser store = new AdminUser(name:'Store',email:'sam.x092@gmail.com',username:'store', password:'store', enabled:true).save()
        AdminUser pkg = new AdminUser(name:'Package',email:'sam.x092@gmail.com',username:'package', password:'package', enabled:true).save()
        AdminUser ship = new AdminUser(name:'Shipping',email:'sam.x092@gmail.com',username:'ship', password:'ship', enabled:true).save()

        AdminRole common = new AdminRole(authority: 'ROLE_ADMIN').save()
        AdminRole royalty = new AdminRole(authority: 'ROLE_SUPERADMIN').save()
        AdminRole storerole = new AdminRole(authority: 'ROLE_STOREMANAGER').save()
        AdminRole pkgrole = new AdminRole(authority: 'ROLE_PACKAGEMANAGER').save()
        AdminRole shiprole = new AdminRole(authority: 'ROLE_SHIPPINGMANAGER').save()
        AdminUserAdminRole.create(admin,common)
        AdminUserAdminRole.create(store,storerole)
        AdminUserAdminRole.create(pkg,pkgrole)
        AdminUserAdminRole.create(ship,shiprole)
        AdminUserAdminRole.create(sayem,royalty)
    }
    def destroy = {
    }
}
