/**
 * Created by dmishchenko on 3/2/2017.
 */
public class ApiRequestBuilder {

    public static String appIdPrefix = "&APPID=";
    public static String appId = "2e09b750d4b30a88d77193550c96d7b8";
    public static String path = "/data/2.5/weather";

    public static String getRequestByCityName(String cityName) {
        return path + "?q=" + cityName + appIdPrefix + appId;
    }

    public static String getRequestByCityId(String cityId) {
        return path + "?id=" + cityId + appIdPrefix + appId;
    }

    public static String getRequestByCoordinates(String latitude, String longitude) {
        return path + "?lat=" + latitude + "&lon=" + longitude + appIdPrefix + appId;
    }

    public static String getRequestByZipCode(String zipCode, String countryCode) {
        return path + "?zip=" + zipCode + "," + countryCode + appIdPrefix + appId;
    }
}
