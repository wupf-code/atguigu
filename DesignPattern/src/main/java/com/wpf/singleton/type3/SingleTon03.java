package com.wpf.singleton.type3;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:27
 * @projectName:尚硅谷javaweb
 */

/*懒汉式，实现懒加载
    线程不安全
    起到懒加载效果
    多线程下可能会出现问题
    实际开发不能使用，有潜在风险
    */
public class SingleTon03 {
    public static void main(String[] args) {
        var a=Single.getInstance();
        var b =Single.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

class Single{
    private static Single instance;
    private Single(){};
    //提供一个静态公有方法，在使用时创建instance;
    //懒汉式
    public static  Single getInstance(){
        if(instance==null)instance=new Single();
        return instance;
    }
}
