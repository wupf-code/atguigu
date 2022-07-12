package com.wpf.singleton.type5;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:27
 * @projectName:尚硅谷javaweb
 */

/*懒汉式，实现懒加载
    //不仅没解决线程安全，还没解决效率问题
    实际开发不建议使用
    */
public class SingleTon5 {
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

    public static  Single getInstance(){
        if(instance==null)synchronized(Single.class) {instance=new Single();}
        return instance;
    }
}
