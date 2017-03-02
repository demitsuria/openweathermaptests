import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class OpenWeatherTests {

    @Test
    public void testResponseCodeWithCityNameParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCityName("London").cod, new Integer(200));
    }

    @Test
    public void testResponseCodeWithCityIdParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCityId("2172797").cod, new Integer(200));
    }

    @Test
    public void testResponseCodeWithCoordinateParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCoordinates("35", "139").cod, new Integer(200));
    }

    @Test
    public void testResponseCodeWithZipCodeParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByZipCode("94040", "us").cod, new Integer(200));
    }

    @Test
    public void testCityNameWithCityNameParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCityName("London").name, "London");
    }

    @Test
    public void testCityNameWithCityIdParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCityId("2172797").name, "Cairns");
    }

    @Test
    public void testCityNameWithCoordinateParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByCoordinates("35", "139").name, "Shuzenji");
    }

    @Test
    public void testCityNameWithZipCodeParameter() {
        OpenWeather ow = new OpenWeather();
        Assert.assertEquals(ow.getWeatherByZipCode("94040", "us").name, "Mountain View");
    }

    @Test
    public void testWeatherId() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").weather.get(0).id.equals(0));
    }

    @Test
    public void testWeatherMain() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").weather.get(0).main.equals(""));
    }

    @Test
    public void testWeatherDescription() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").weather.get(0).description.equals(""));
    }

    @Test
    public void testWeatherIcon() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").weather.get(0).icon.equals(""));
    }

    @Test
    public void testTemp() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").main.temp.equals(new BigDecimal(-500)));
    }

    @Test
    public void testPressure() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").main.pressure.equals(new BigDecimal(-500)));
    }

    @Test
    public void testHumidity() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").main.humidity.equals(new BigDecimal(-500)));
    }

    @Test
    public void testTemp_min() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").main.temp_min.equals(new BigDecimal(-500)));
    }

    @Test
    public void testTemp_max() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").main.temp_max.equals(new BigDecimal(-500)));
    }

    @Test
    public void testWindSpeed() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").wind.speed.equals(new BigDecimal(-500)));
    }

    @Test
    public void testWindDeg() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").wind.deg.equals(new BigDecimal(-500)));
    }

    @Test
    public void testCloudsAll() {
        OpenWeather ow = new OpenWeather();
        Assert.assertFalse(ow.getWeatherByCityName("London").clouds.all.equals(new BigDecimal(-500)));
    }

}