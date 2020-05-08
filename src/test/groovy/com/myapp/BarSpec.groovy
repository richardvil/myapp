package com.myapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BarSpec extends Specification implements DomainUnitTest<Bar> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
