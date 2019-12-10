package com.gupaoedu.pattern.prototype;

import java.util.List;

/**
 * @ClassName ConcretePrototypeA
 * @Description 克隆对象
 * @Author yangting
 * @Date 2019/12/9 3:25 下午
 * @Version 1.0
 */
public class ConcretePrototypeA implements Prototype {
    private String name;
    private int age;
    private List<String> courses;

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

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public Prototype clone() {//浅克隆
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setCourses(this.courses);
        return concretePrototypeA;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
