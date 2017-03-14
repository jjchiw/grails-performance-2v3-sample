package sample

class Foo {
    long id
    String name
    String phone
    String email
    String somedate
    String company
    String siret
    String chileanRutNumber
    String personalNumber
    String organizationNumber
    //XEnum mySuperValue

    static mapping = {
        version false
    }

    static constraints = {
        //mySuperValue nullable:true
    }
}
