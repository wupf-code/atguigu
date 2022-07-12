package com.wpf.singleton.type6;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:27
 * @projectName:尚硅谷javaweb
 */

/*懒汉式，实现懒加载
    线程安全
    双重检查，建议使用，解决之前的几种方式不足
    */
public class SingleTon06 {
    public static void main(String[] args) {
        var a=Single.getInstance();
        var b =Single.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

class Single{
    private static volatile Single instance;
    private Single(){};

    public static  Single getInstance(){
        if(instance==null)synchronized(Single.class) {
            if(instance==null)
            instance=new Single();
        }
        return instance;
    }
}
