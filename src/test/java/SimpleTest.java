/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import com.ibm.rest.HelloService;

/**
 * @author raman
 *
 */
public class SimpleTest extends JerseyTest {

 @Override
    protected Application configure() {
        return new ResourceConfig(HelloService.class);
    }

     @Test
    public void testWithNoRequestParameter(){
    	final String hello = target("sayhello").request().get(String.class);
    	
        assertEquals("<Greeting>Hello !! Good Morning</Greeting>", hello);
    }
    
   
     @Test
     public void testWithRequestParameter() {
     	final String hello = target("sayhello/test").request().get(String.class);
     	
         assertEquals("<Greeting>Hello !! Good Morning test</Greeting>", hello);
     }
}
