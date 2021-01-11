package com.zkteco.biometric;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HttpClient httpClient = HttpClientBuilder.create().build();
        try {
            HttpPost request = new HttpPost("https://pchessle.tk/test/api/end-point/test-api.php");
            StringEntity params = new StringEntity("details={\"name\":\"xyz\",\"age\":\"20\"}");
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            System.out.print(EntityUtils.toString(response.getEntity()));
        } catch (Exception ex) {
        } finally {
            // @Deprecated httpClient.getConnectionManager().shutdown(); 
        }

    }
}
