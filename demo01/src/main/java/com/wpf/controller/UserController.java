package com.wpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/6 - 17:13
 * @projectName:尚硅谷javaweb
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    //设置返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save");
        return "{'modole':'springmvc','yxc':'wpf'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete");
        return "{'user':'delete'}";
    }
}
