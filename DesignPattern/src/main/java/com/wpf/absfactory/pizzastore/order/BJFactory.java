package com.wpf.absfactory.pizzastore.order;

import com.wpf.absfactory.pizzastore.pizza.BJChessPizza;
import com.wpf.absfactory.pizzastore.pizza.BJPepperPizza;
import com.wpf.absfactory.pizzastore.pizza.Pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/13 - 17:05
 * @projectName:尚硅谷javaweb
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("Chess")){
            pizza=new BJChessPizza();
        } else if (orderType.equals("Pepper")) {
            pizza=new BJPepperPizza();

        }
        return pizza;
    }
}
