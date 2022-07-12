package com.wpf.factory.pizzastore.order;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:17
 *
 */

/**
 * 传统方式，简单易理解，违反ocp原则，不易扩展
 * 如果有需要加入新的pizza种类，需要新的类，并且在订单中需要添加新的pizza,如果多处使用创建pizza的代码，工作量大。
 *
 * 改进思路，将创建pizza封装进类中，即简单工厂模式
 * @author ASUS
 */
public class PizzaStore {
    public static void main(String[] args) {
        //var s=new OrderPizza();
        //使用简单工厂
        var s=new OrderPizza(new SimpleFactory());

    }
}
