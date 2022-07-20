package com.wpf.absfactory.pizzastore.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:28
 * @projectName:尚硅谷javaweb
 */
public class LDChessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备材料");
    }
}
