package response;

import java.math.BigDecimal;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class Sys {
    public BigDecimal type;
    public BigDecimal id;
    public BigDecimal message;
    public String country;
    public BigDecimal sunrise;
    public BigDecimal sunset;

    public Sys() {
        this.type = new BigDecimal(0);
        this.id = new BigDecimal(0);
        this.message = new BigDecimal(0);
        this.country = "";
        this.sunrise = new BigDecimal(0);
        this.sunset = new BigDecimal(0);
    }
}
