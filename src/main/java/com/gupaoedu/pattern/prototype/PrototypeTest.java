package com.gupaoedu.pattern.prototype;

import java.util.ArrayList;

/**
 * @ClassName PrototypeTest
 * @Description 测试类
 * @Author yangting
 * @Date 2019/12/9 3:32 下午
 * @Version 1.0
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
//        ConcretePrototypeA prototype = new ConcretePrototypeA();
//        prototype.setAge(12);
//        prototype.setName("寰宇");
//        List<String> list = new ArrayList<>();
//        list.add("math");
//        list.add("english");
//        prototype.setCourses(list);
//
//
//        ConcretePrototypeA clone = (ConcretePrototypeA) Client.startClone(prototype);
//        clone.setName("李四");
//        clone.getCourses().add("chinese");
//
//        System.out.println(prototype);
//        System.out.println(clone);

        Student student = new Student();
        student.setAge(18);
        student.setName("路怀勋");
        ArrayList<String> list = new ArrayList<>();
        list.add("math");
        student.setCourses(list);

        Student clone = (Student) student.clone();
        clone.setName("邵言");
        clone.getCourses().add("english");

        System.out.println(student);
        System.out.println(clone);
    }
}
