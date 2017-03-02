package response;

/**
 * Created by dmishchenko on 3/2/2017.
 */
public class Weather {

    public Integer id;
    public String main;
    public String description;
    public String icon;

    public Weather() {
        this.id = new Integer(0);
        this.main = "";
        this.description = "";
        this.icon = "";
    }
}
