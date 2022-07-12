package com.wpf.factory.pizzastore.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:08
 * @projectName:尚硅谷javaweb
 */
public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给Chess准备材料");
    }
}
