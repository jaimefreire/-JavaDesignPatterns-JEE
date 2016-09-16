package eu.jaimefreire.java;

/**
 * Created by jaimefreire on 15.09.16.
 */
import eu.jaimefreire.java.interfaces.Hello;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
    @Stateless(mappedName = "java:global/hello")
    @Remote(value=Hello.class)
    public class HelloBean implements Hello {
        public String sayHello(){
            return "Hello World!!!!";
        }
    }

