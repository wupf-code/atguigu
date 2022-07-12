package com.wpf.factory.pizzastore.order;

import com.wpf.factory.pizzastore.pizza.ChessPizza;
import com.wpf.factory.pizzastore.pizza.GreekPizza;
import com.wpf.factory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:10
 * @projectName:尚硅谷javaweb
 */
public class OrderPizza {
/**
 * /**
 *  * 传统方式，简单易理解，违反ocp原则，不易扩展
 *  * 如果有需要加入新的pizza种类，需要新的类，并且在订单中需要添加新的pizza,如果多处使用创建pizza的代码，工作量大。
 *  *
 *  * 改进思路，将创建pizza封装进类中，即简单工厂模式
 *  * @author ASUS
 *
 *
 *
 * public OrderPizza (){
        Pizza pizza=null;
        String orderType;
        do{
            orderType= getType();
            if("Greek".equals(orderType)){
                pizza=new GreekPizza();
                pizza.setName("Greek");
            }else if ("Chess".equals(orderType)){
                pizza=new ChessPizza();
                pizza.setName("Chess");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bok();
        }while (true);

    }*/

    /** 简单共厂
     *
     */
    SimpleFactory simpleFactory=null;
    Pizza pizza=null;
    public OrderPizza (SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory s){
        String orderType="";
        this.simpleFactory=s;
        do{
            orderType=getType();
            pizza = this.simpleFactory.create(orderType);
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
    private String getType(){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        return s;
    }

}
