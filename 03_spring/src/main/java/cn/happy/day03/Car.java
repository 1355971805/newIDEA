package cn.happy.day03;

/**
 * Created by 王 on 2017/7/26.
 */
public class Car {
    private  String color;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
