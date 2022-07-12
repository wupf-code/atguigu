package com.wpf.singleton.type4;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:27
 * @projectName:尚硅谷javaweb
 */

/*懒汉式，实现懒加载
    线程安全，同步方法
    但是效率变低
    实际开发不建议使用
    */
public class SingleTon04 {
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
    //提供一个静态公有方法，在使用时创建instance; 加入同步处理代码
    //懒汉式
    //加锁
    public static synchronized Single getInstance(){
        if(instance==null)instance=new Single();
        return instance;
    }
}
