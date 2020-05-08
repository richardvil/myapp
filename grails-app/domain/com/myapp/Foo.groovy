package com.myapp

import static grails.gorm.hibernate.mapping.MappingBuilder.orm

class Foo {

    static constraints = {
    }

    static mapping = orm {
        tablePerHierarchy false
    }
}
