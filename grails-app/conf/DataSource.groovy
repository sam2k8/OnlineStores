dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
            // dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            // url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            dbCreate = "update"
            pooling = true
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/uxstoredb"
            username = "root"
            password = ""
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
        }
        dataSource.properties.each { println it }
    }

    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {

            dbCreate = "update"
            pooling = true
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/uxstoredb"
            //username = "root"
            //  password = "12_ubitrix.com"
            username = "root"
            password = "Passw0rd!"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect

        }
    }
}
