package com.wpf.pojo;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/18 - 20:00
 * @projectName:尚硅谷javaweb
 */
public class User {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;
}
