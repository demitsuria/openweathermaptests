import com.google.gson.Gson;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import response.OpenWeatherJsonResponse;

import java.io.IOException;


/**
 * Created by dmishchenko on 3/2/2017.
 */
public class OpenWeather {

    private String getStringResponse(String request) {
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
        String output = null;
        try {
            HttpHost target = new HttpHost("api.openweathermap.org", 80, "http");
            HttpGet getRequest = new HttpGet(request);
            HttpEntity httpEntity = httpclient.execute(target, getRequest).getEntity();
            output = EntityUtils.toString(httpEntity);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return output;
        }
    }

    private OpenWeatherJsonResponse getOpenWeatherResponse(String jsonString) {
        Gson g = new Gson();
        return g.fromJson(jsonString, OpenWeatherJsonResponse.class);
    }

    public OpenWeatherJsonResponse getWeatherByCityName(String city) {
        String jsonResponse = getStringResponse(ApiRequestBuilder.getRequestByCityName(city));
        return getOpenWeatherResponse(jsonResponse);
    }

    public OpenWeatherJsonResponse getWeatherByCityId(String cityId) {
        String jsonResponse = getStringResponse(ApiRequestBuilder.getRequestByCityId(cityId));
        return getOpenWeatherResponse(jsonResponse);
    }

    public OpenWeatherJsonResponse getWeatherByCoordinates(String latitude, String longitude) {
        String jsonResponse = getStringResponse(ApiRequestBuilder.getRequestByCoordinates(latitude, longitude));
        return getOpenWeatherResponse(jsonResponse);
    }

    public OpenWeatherJsonResponse getWeatherByZipCode(String zipCode, String countryCode) {
        String jsonResponse = getStringResponse(ApiRequestBuilder.getRequestByZipCode(zipCode, countryCode));
        return getOpenWeatherResponse(jsonResponse);
    }
}