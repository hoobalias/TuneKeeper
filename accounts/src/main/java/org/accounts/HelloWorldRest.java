package org.accounts;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class HelloWorldRest extends Application {
	private static final Logger LOGGER = Logger.getLogger(HelloWorldRest.class.getName());
	
    @Override
    public Set<Class<?>> getClasses() {
    	LOGGER.log(Level.INFO, "Setting up classes");
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(HelloWorldService.class);
        return classes;
    }
}
