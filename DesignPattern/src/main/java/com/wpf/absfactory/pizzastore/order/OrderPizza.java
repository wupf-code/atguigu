package com.wpf.absfactory.pizzastore.order;

import com.wpf.absfactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/13 - 17:09
 * @projectName:尚硅谷javaweb
 */
public class OrderPizza {
    AbsFactory absFactory;
    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }
    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza=null;
        String orderType="";
        this.absFactory=absFactory;
        do{
            orderType=getType();
            pizza=absFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bok();
            }else{
                System.out.println("失败");
                break;
            }
        }while(true);
    }
    private String getType(){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        return s;
    }
}
