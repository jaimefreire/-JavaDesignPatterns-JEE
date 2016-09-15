package java.jaimefreire.eu;

/**
 * Created by jaimefreire on 15.09.16.
 */
import eu.jaimefreire.java.interfaces.Hello;

import javax.ejb.Stateless;
    @Stateless
    public class HelloBean implements Hello {
        public String sayHello(){
            return "Hello World!!!!";
        }
    }

}
