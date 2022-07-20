package com.wpf.absfactory.pizzastore.order;

import com.wpf.absfactory.pizzastore.pizza.*;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/13 - 17:07
 * @projectName:尚硅谷javaweb
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("Chess")){
            pizza=new LDChessPizza();
        } else if (orderType.equals("Pepper")) {
            pizza=new LDPepperPizza();

        }
        return  pizza;
    }
}
