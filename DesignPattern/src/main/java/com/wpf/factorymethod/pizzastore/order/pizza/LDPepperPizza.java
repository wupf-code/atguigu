package com.wpf.factorymethod.pizzastore.order.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 18:28
 * @projectName:尚硅谷javaweb
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦奶胡椒萨准备材料");
    }
}
