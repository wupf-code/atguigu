package com.wpf.builder;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:26
 * @projectName:尚硅谷javaweb
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public  House constructHouse(){
        houseBuilder.buildBasis();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
