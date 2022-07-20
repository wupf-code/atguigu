package com.wpf.builder;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:20
 * @projectName:尚硅谷javaweb
 */
public abstract class HouseBuilder {
    protected  House house=new House();
    public abstract void buildBasis();
    public abstract void buildWalls();
    public abstract void buildRoof();
    public House buildHouse(){

        return house;
    }

}
