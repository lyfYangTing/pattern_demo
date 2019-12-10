package com.gupaoedu.pattern.singleton.register;
//枚举式单例
public enum EnumSingleton {
    /**
     * 枚举式单例在静态代码块中就给 INSTANCE 进行了赋值，是饿汉式单例的实现。
     * static {
     * INSTANCE = new EnumSingleton("INSTANCE", 0);
     * $VALUES = (new EnumSingleton[] {INSTANCE }
     * );}
     *
     */
    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
