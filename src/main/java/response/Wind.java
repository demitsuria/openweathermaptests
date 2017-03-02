package response;

import java.math.BigDecimal;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class Wind {
    public BigDecimal speed;
    public BigDecimal deg;

    public Wind() {
        this.speed = new BigDecimal(-500);
        this.deg = new BigDecimal(-500);
    }
}