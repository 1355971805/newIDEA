package cn.happy.zhu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 王 on 2017/7/26.
 */
@Component("car")
public class Car {
    @Value("兰博基尼")
    private String ban;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ban='" + ban + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Value("紫色")

    private String color;
}
