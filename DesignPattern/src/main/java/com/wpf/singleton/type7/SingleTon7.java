package com.wpf.singleton.type7;

import com.wpf.singleton.type3.SingleTon03;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 16:16
 * @projectName:尚硅谷javaweb
 */

/*使用静态内部类，线程安全，懒加载
* 效率高
* 推荐使用
*
* */
public class SingleTon7 {
    public static void main(String[] args) {
        var a= Single.getInstance();
        var b = Single.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}


class Single{
    private Single (){}
    private static class SingleInstance{
        private final static Single intance=new Single();
    }

    public static Single getInstance(){
        return SingleInstance.intance;
    }
}