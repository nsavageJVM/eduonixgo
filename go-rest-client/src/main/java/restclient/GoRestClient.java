package restclient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * The Resteasy Proxy Framework is the mirror opposite of the JAX-RS server-side specification
 *https://docs.jboss.org/resteasy/docs/3.0-beta-3/userguide/html/RESTEasy_Client_Framework.html
 *
 */
public interface GoRestClient {

    @GET
    @Path("/items")
    @Produces("application/json")
    String getItems();


}
