package com.wpf.factory.pizzastore.pizza;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/12 - 16:02
 * @projectName:尚硅谷javaweb
 */

/**抽象类
 *
 */
public abstract class Pizza {
    private String name;

    /**
    不同的pizza准备材料不一样；
    */
    public abstract void prepare();
    public void bake(){
        System.out.println(getName() +"bake");
    }
    public void cut(){
        System.out.println(getName() +"cut");
    }
    public void bok(){
        System.out.println(getName() +"box");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
