package com.wpf.factorymethod.pizzastore.order;


import com.wpf.absfactory.pizzastore.pizza.LDChessPizza;
import com.wpf.absfactory.pizzastore.pizza.LDPepperPizza;
import com.wpf.absfactory.pizzastore.pizza.Pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:44
 * @projectName:尚硅谷javaweb
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("Chess")) {
            pizza=new LDChessPizza();
        }else if(orderType.equals("Pepper")){
            pizza= new LDPepperPizza();
        }
        return pizza;
    }
}
