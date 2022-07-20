package com.wpf.Prototype;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/14 - 8:54
 * @projectName:尚硅谷javaweb
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep=null;
        try {
            sheep=(Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
