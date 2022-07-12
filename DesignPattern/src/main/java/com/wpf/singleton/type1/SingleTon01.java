package com.wpf.singleton.type1;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:11
 * @projectName:尚硅谷javaweb
 */
//饿汉式，静态常量写法
//单例模式可用但是，可能浪费内存  优点是避免了线程同步问题
public class SingleTon01 {
    public static void main(String[] args) {
        SingleTon a=SingleTon.instance;
        SingleTon b=SingleTon.getInstance();
        System.out.println(a==b);
    }
}
class SingleTon{
    private SingleTon(){};
    public final static SingleTon instance =new SingleTon();
    public static SingleTon getInstance(){
        return instance;
    }
}