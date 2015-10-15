import java.io.Serializable;

/**
 * Created by JordanHope on 10/9/2015.
 */
public class CarBean implements Serializable {
    private int year;
    private String model;
    private String color;
    private String make;

    public CarBean(int year, String model, String color, String make) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
