/**
 * 
 */
package com.ibm.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author raman
 *
 */
public class MyApplication extends Application{
	
	 @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> s = new HashSet<Class<?>>();

	        s.add(HelloService.class);
	  
	        return s;
	    }

}
