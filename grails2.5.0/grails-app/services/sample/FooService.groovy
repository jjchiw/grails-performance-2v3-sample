package sample

import grails.transaction.Transactional

@Transactional
class FooService {

    def getAll() {
        def result = Foo.createCriteria().list{
            gt 'id', 0L
        }
        return result
    }
}
