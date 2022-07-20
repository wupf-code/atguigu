package com.wpf.Prototype;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/14 - 9:03
 * @projectName:尚硅谷javaweb
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep =new Sheep("tom",1,"green");
        Sheep sheep1= (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep1);
        sheep.setAge(2);
        System.out.println(sheep.toString());
        System.out.println(sheep1);
    }
}
