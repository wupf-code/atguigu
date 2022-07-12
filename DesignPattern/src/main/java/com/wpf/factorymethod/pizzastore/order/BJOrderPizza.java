package com.wpf.factorymethod.pizzastore.order;

import com.wpf.factorymethod.pizzastore.pizza.BJChessPizza;
import com.wpf.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.wpf.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:44
 * @projectName:尚硅谷javaweb
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("Chess")) {
            pizza=new BJChessPizza();
        }else if(orderType.equals("Pepper")){
            pizza= new  BJPepperPizza();
        }
        return pizza;
    }
}
