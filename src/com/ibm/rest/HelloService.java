/**
 * 
 */
package com.ibm.rest;

/**
 * @author raman
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


 
@Path("/sayhello")
public class HelloService { 
    
    
	@GET
	@Produces("application/xml")
	public String sayHello() {

		return "<Greeting>" + "Hello !! Good Morning"+"</Greeting>";
	}
 
	@Path("{name}")
	@GET
	@Produces("application/xml")
	public String sayHello(@PathParam("name") String name) {
		
		return "<Greeting>" + "Hello !! Good Morning "+name +"</Greeting>";
		
	}
}
