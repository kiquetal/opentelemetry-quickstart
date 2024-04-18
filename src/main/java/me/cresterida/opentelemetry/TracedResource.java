package me.cresterida.opentelemetry;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.logging.Logger;

@Path("/hello")
public class TracedResource
{
    private static final Logger Log = Logger.getLogger(TracedResource.class.getName());
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello()
    {
        Log.info("Hello from traced resource");
        return "Hello from traced resource";
    }
}
