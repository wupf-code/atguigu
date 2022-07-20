package com.wpf.builder;

import java.util.PrimitiveIterator;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/15 - 16:18
 * @projectName:尚硅谷javaweb
 */
public class House {
    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    private  String basis;
    private String  walls;
    private String roof;

}
