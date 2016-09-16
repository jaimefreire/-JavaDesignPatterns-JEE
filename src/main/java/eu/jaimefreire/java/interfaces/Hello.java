package eu.jaimefreire.java.interfaces;

import javax.ejb.Remote;
import java.io.Serializable;

/**
 * Created by jaimefreire on 15.09.16.
 */
public interface Hello extends Serializable{
    String sayHello();
}
