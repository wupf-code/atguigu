package com.wpf.absfactory.pizzastore.order;
import com.wpf.absfactory.pizzastore.pizza.Pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/13 - 17:01
 * @projectName:尚硅谷javaweb
 */

/**
 * 一个抽象工厂抽象层
 *
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
