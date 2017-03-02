package response;

import java.math.BigDecimal;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class Main {
    public BigDecimal temp;
    public BigDecimal pressure;
    public BigDecimal humidity;
    public BigDecimal temp_min;
    public BigDecimal temp_max;

    public Main() {
        this.temp = new BigDecimal(-500);
        this.pressure = new BigDecimal(-500);
        this.humidity = new BigDecimal(-500);
        this.temp_min = new BigDecimal(-500);
        this.temp_max = new BigDecimal(-500);
    }
}
