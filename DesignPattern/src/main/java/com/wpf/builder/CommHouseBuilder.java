package com.wpf.builder;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:23
 * @projectName:尚硅谷javaweb
 */
public class CommHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasis() {
        System.out.println("打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("造墙10米");
    }

    @Override
    public void buildRoof() {
        System.out.printf("建普通屋顶");
    }
}
