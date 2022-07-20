package com.wpf.factorymethod.pizzastore.order;


import com.wpf.absfactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:33
 * @projectName:尚硅谷javaweb
 */
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza=null;
        String orderType="";

        do{
            orderType=getType();
            pizza = createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bok();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while(true);

    }

    abstract Pizza createPizza(String orderType) ;

    String getType(){
            Scanner in=new Scanner(System.in);
            String s=in.next();
            return s;
        }
}
