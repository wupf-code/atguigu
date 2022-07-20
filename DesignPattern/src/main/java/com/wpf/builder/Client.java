package com.wpf.builder;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:31
 * @projectName:尚硅谷javaweb
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommHouseBuilder());
        House house = houseDirector.constructHouse();
        houseDirector.setHouseBuilder(new HighHouseBuilder());
        house = houseDirector.constructHouse();
    }
}
