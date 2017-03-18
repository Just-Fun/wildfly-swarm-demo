package serzh.com.ua.wildflyswarmdemo.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

//http://wildfly-swarm.io/generator/
@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello from WildFly Swarm!").build();
	}
}