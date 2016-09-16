import eu.jaimefreire.java.HelloBean;
import eu.jaimefreire.java.interfaces.Hello;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.Properties;

/**
 * Created by jaimefreire on 16.09.16.
 */
public class HelloClientMain {
    //Retrieve remote Interface

    public static void main(String[]
                                    args) throws Exception {
        Properties props = new Properties();

        Thread.currentThread().setContextClassLoader(HelloClientMain.class.getClassLoader());


        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        // glassfish default port value will be 3700,
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

        //props.put(Context.PROVIDER_URL, "ejbd://127.0.0.1:4201");
        Context ctx = new InitialContext(props);
        Object ref = ctx.lookup("java:global/JavaEEDesignPatterns_war/HelloBean");
        Hello hello = (Hello) PortableRemoteObject.narrow(ref, Hello.class);
        String result = hello.sayHello();
        System.out.println(result);
    }
}
