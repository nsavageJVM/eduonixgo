package javarunner;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import restclient.GoRestClient;
import restclient.RestProperties;


/**
 * Resteasy client extension interface GoRestClient
 *
 * https://docs.jboss.org/resteasy/docs/3.0-beta-3/userguide/html/RESTEasy_Client_Framework.html
 */
public class BootStrapClient {

    public static void main(String[] args) {

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(RestProperties.getServerUrl());

        GoRestClient simple = target.proxy(GoRestClient.class);
        System.out.println(simple.getItems());


    }

}
