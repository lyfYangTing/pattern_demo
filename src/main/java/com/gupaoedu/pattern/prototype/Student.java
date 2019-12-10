package com.gupaoedu.pattern.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Student
 * @Description 学生原型
 * @Author yangting
 * @Date 2019/12/9 3:50 下午
 * @Version 1.0
 */
public class Student implements Cloneable, Serializable {

    private int age;
    private String name;
    private ArrayList<String> courses = new ArrayList<>();

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

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆 super.clone();
        // 深克隆
        Student clone = (Student) super.clone();
        clone.setCourses((ArrayList<String>) this.courses.clone());
        return clone;
    }


    /**
     * 自己通过 序列化实现深克隆
     * @return
     */
    private Object myDeepClone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(bos);
            outputStream.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bis);
            Student clone = (Student) objectInputStream.readObject();
            return clone;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 利用Java自带的Object中的clone实现深克隆
     * @return
     */
    private Object deepClone(){
        try {
            Student clone = (Student) super.clone();
            clone.setCourses((ArrayList<String>) clone.courses.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
