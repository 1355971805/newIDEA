package cn.happy.day03;

/**
 * Created by 王 on 2017/7/26.
 */
public class Student
{
    private Car car;


    @Override
    public String toString() {
        return "Student{" +
                "car=" + car +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public Student(String name, int age, Car car) {
        this.name=name;
        this.age=age;
        this.car=car;

    }
    public Student(){
        System.out.println("-----------");
    };

    public void setCar(Car car) {
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private  int age;
}
