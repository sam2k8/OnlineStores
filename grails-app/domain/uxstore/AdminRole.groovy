package uxstore

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes = 'authority')
@ToString(includes = 'authority', includeNames = true, includePackage = false)
class AdminRole implements Serializable {

    private static final long serialVersionUID = 1

    String authority

    AdminRole(String authority) {

        this.authority = authority
    }

    static constraints = {
        authority blank: false, unique: true
    }

    static mapping = {
        cache true
    }
}
