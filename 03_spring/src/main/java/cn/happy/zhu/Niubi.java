package cn.happy.zhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by 王 on 2017/7/26.
 */
@Component("niubi")
public class Niubi {
    @Value("本清")
    private String name;
    @Value("18")
    private int age;

    @Override
    public String toString() {
        return "Niubi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
   //@Resource()
    @Autowired
    @Qualifier("car")
    private Car car;
}
