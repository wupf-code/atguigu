package com.wpf.singleton.type9;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/11 - 16:31
 * @projectName:尚硅谷javaweb
 */

/*使用枚举实现单例，推荐使用，防止反序列化，避免多线程问题
*
* */
public class SingleTonTest08 {
    public static void main(String[] args) {
        var a=Single.INSTANCE;
        var b=Single.INSTANCE;
        var c=Single.YELLOW;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        a.sayOk();

    }
}

enum Single{
    INSTANCE,YELLOW;
    public void sayOk(){
        System.out.println("OK");
    }


}