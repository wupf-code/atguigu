package com.wpf.builder;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:24
 * @projectName:尚硅谷javaweb
 */
public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasis() {
        System.out.println("高楼地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼墙高100米");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼屋顶");
    }
}
