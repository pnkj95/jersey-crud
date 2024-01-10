package com.jersey.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.logging.LoggingFeature;
//Deployment of a JAX-RS application using @ApplicationPath with Servlet 3.0
//Descriptor-less deployment
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class JerseyServletContainerConfig extends ResourceConfig {
 public JerseyServletContainerConfig() {
     packages("com.jersey.demo.resources");
     
     //to enable logging in jersey framework(Jersey uses JDK java.util.logging internally for logging purpose)
     register(new LoggingFeature(Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME),
    		    Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 10000));
 }
}
