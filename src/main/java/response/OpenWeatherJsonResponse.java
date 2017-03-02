package response;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class OpenWeatherJsonResponse {
    @SerializedName("coord")
    public Coord coord;

    @SerializedName("weather")
    public List<Weather> weather;

    @SerializedName("base")
    public String base;

    @SerializedName("main")
    public Main main;

    @SerializedName("visibility") //not in the list on http://openweathermap.org/current page, but exists in response
    public BigDecimal visibility;

    @SerializedName("wind")
    public Wind wind;

    @SerializedName("clouds")
    public Clouds clouds;

    /*No luck implementing rain and snow parameters, it seems they were deprecated and left in API documentation by mistake

    /*@SerializedName("rain")
    public Rain rain;

    @SerializedName("snow")
    public Snow snow;*/

    @SerializedName("dt")
    public BigDecimal dt;

    @SerializedName("sys")
    public Sys sys;

    @SerializedName("id")
    public BigDecimal id;

    @SerializedName("name")
    public String name;

    @SerializedName("cod")
    public Integer cod;

}
