package com.gupaoedu.pattern.factory.simple;

import com.gupaoedu.pattern.factory.Icourse;

/**
 * @ClassName SimpleFactory
 * @Description 简单工厂模式(Simple Factory Pattern):是指由一个工厂对象决定创建出哪一种产品类 的实例
 * 适用场景:负责创建的对象较少的场景，且客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 * 缺点:工厂类的职责相对过重，不易于扩展过于复杂的产品结构。(业务扩展 违反 开闭原则)
 * JDK应用:Calendar类中的createCalendar方法
 * logback中:LoggerFactory类的getLogger方法
 * @Author yangting
 * @Date 2019-12-04 19:17
 * @Version 1.0
 */
public class SimpleFactory {


    /**
     * 自定义courseName 没有限制 容易传错
     * @param courseName
     * @return
     */
//    public static Icourse getCourse(String courseName){
//        Icourse course = null;
//        switch (courseName){
//            case "java":
//                course = new JavaCourse();
//                break;
//            case "python":
//                course = new PythonCourse();
//                break;
//            default:
//                course = null;
//        }
//        return course;
//    }


    /**
     * 通过传的类名 生成对象
     * @param courseClassName
     * @return
     */
//    public static Icourse getCourse(String courseClassName){
//        try{
//            Class clazz = Class.forName(courseClassName);
//            return (Icourse)clazz.newInstance();
//        }catch (Exception e){
//            e.getStackTrace();
//        }
//        return null;
//    }


//    public static <T extends Icourse> Icourse getCourse(Class<T> clazz){
//        try {
//            if(clazz!=null){
//                return clazz.newInstance();
//            }
//        }catch (Exception e){
//            e.getStackTrace();
//        }
//        return null;
//    }


    public static Icourse getCourse(Class<? extends Icourse> clazz){
        try {
            if(clazz!=null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

}
