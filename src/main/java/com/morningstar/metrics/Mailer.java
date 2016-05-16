package main.java.com.morningstar.metrics;

/**
 * Created by sameenislam on 17/05/2016.
 */
public class Mailer {

    public static ClientResponse SendSimpleMessage() {
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("api",
                "YOUR_API_KEY"));
        WebResource webResource =
                client.resource("https://api.mailgun.net/v3/YOUR_DOMAIN_NAME" +
                        "/messages");
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
        formData.add("from", "Excited User <mailgun@YOUR_DOMAIN_NAME>");
        formData.add("to", "bar@example.com");
        formData.add("to", "YOU@YOUR_DOMAIN_NAME");
        formData.add("subject", "Hello");
        formData.add("text", "Testing some Mailgun awesomness!");
        return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
                post(ClientResponse.class, formData);
    }
}
