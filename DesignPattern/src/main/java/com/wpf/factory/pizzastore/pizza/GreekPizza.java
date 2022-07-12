package com.wpf.factory.pizzastore.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:09
 * @projectName:尚硅谷javaweb
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给GreekPizza准备材料");
    }
}
