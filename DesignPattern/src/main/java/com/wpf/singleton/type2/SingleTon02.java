package com.wpf.singleton.type2;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 15:11
 * @projectName:尚硅谷javaweb
 */
//饿汉式，静态代码块
//单例模式可用但是，可能浪费内存  优点是避免了线程同步问题
public class SingleTon02 {
    public static void main(String[] args) {
        SingleTon a=SingleTon.getInstance();
        SingleTon b=SingleTon.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
class SingleTon{
    private SingleTon(){

    };
    static {
        instance=new SingleTon();
    }
    private  static SingleTon instance;
    public static SingleTon getInstance(){
        return instance;
    }
}