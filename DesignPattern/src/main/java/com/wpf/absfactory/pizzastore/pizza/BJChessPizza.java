package com.wpf.absfactory.pizzastore.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:28
 * @projectName:尚硅谷javaweb
 */
public class BJChessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备材料");
    }
}
