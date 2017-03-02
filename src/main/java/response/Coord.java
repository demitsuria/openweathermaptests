package response;

import java.math.BigDecimal;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class Coord {
    public BigDecimal lon;
    public BigDecimal lat;

    public Coord() {
        this.lon = new BigDecimal(0);
        this.lat = new BigDecimal(0);
    }
}
