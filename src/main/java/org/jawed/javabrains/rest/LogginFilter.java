package org.jawed.javabrains.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

//This Class is to show how to implement/read Filters from RequestHeader and ResponseHeader 
@Provider
public class LogginFilter implements ContainerRequestFilter, ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		System.out.println("Response Filters");
		//responseContext.getHeaders().add("X-Powered-By", "Java Brains");
		System.out.println("Headers: " + responseContext.getHeaders());
		
	}

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Request Filters");
		System.out.println("Headers: " + requestContext.getHeaders());
		
	}

	
}
