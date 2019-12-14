package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName Father
 * @Description 父亲类: 帮儿子相亲
 * @Author yangting
 * @Date 2019/12/10 2:43 下午
 * @Version 1.0
 */
public class Father implements Person{

    //目标对象
    private Son son;

    //父亲 只帮儿子相亲 扩展性差
    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父母物色对象");//对目标对象的增强
        son.findLove();//目标对象的引用给拿到 并且执行目标对象方法
        System.out.println("双方同意交往，确立关系");//对目标对象的增强
    }
}
