package sampleperformance3

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import org.grails.orm.hibernate.cfg.AbstractIdentityEnumType
import javassist.ClassPool
import javassist.ClassClassPath

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {

        //Uncomment to test that this work with a runnable war
        // def pool = ClassPool.getDefault();
        // def ccpath = new ClassClassPath(AbstractIdentityEnumType.class);
        // pool.insertClassPath(ccpath);
        // def ctClass = pool.get(AbstractIdentityEnumType.name);

        GrailsApp.run(Application, args)
    }

    //Using this if we are generating a war and put it in a container
    //  @Override
    // void setEnvironment(Environment environment) {
    //     // "workaround" para arreglar el enum por idenficador
    //     def pool = ClassPool.getDefault()
    //     def ccpath = new ClassClassPath(AbstractIdentityEnumType.class)
    //     pool.insertClassPath(ccpath)
    //     pool.get(AbstractIdentityEnumType.name)
    // }
}