package sample

import grails.converters.JSON

class FooController {

    def fooService

    def index() {
        def result = fooService.getAll()
        render result as JSON
    }
}
