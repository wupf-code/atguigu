# 单例模式
## 使用场景
1. 需要频繁的创建和销毁对象
2. 创建要多次使用的重量级对象
3. 工具类对象
4. 频繁访问数据库或文件的对象（session工厂）
## 单例模式推荐使用方式
   1. 饿汉式（单线程，可能造成内存浪费）
      1. 静态代码块 
       ```java
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
       ```
       2. 静态常量
       ```java
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

   2. 懒汉式（线程不安全，效率低的方式不进行枚举）
      - 双重检查
      ```java
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
            ```
        

- 静态内部类
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

- 枚举类
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

