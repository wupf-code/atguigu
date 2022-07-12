package com.wpf.factory.pizzastore.order;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:37
 *
 */

import com.wpf.factory.pizzastore.pizza.ChessPizza;
import com.wpf.factory.pizzastore.pizza.GreekPizza;
import com.wpf.factory.pizzastore.pizza.Pizza;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public Pizza create(String orderType){
        Pizza pizza=null;
        System.out.println("简单工厂模式");
        if("Greek".equals(orderType)){
            pizza=new GreekPizza();
            pizza.setName("Greek");
        }else if ("Chess".equals(orderType)){
            pizza=new ChessPizza();
            pizza.setName("Chess");
        }
        return pizza;
    }
}
