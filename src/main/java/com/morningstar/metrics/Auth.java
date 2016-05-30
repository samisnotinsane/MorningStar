package main.java.com.morningstar.metrics;

/**
 * Created by sameenislam on 16/05/2016.
 * Authenticates with the Waka Time API using basic authentication.
 */
public class Auth {

    private String resourceUrl = "https://wakatime.com/api/v1/users/current/durations?date=2016-05-15";
    private String encodedAPISecret = "ZmUxY2E5ZDQtNTBjZi00MjA1LTk4NGUtMmEwZTQxZWFhMWI3";
    private String AUTH_TYPE = "Basic";
    private String apiReqKey = AUTH_TYPE + encodedAPISecret;



}
