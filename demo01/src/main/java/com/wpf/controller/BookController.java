package com.wpf.controller;

import com.wpf.doman.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.element.NestingKind;
import java.util.List;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/7 - 16:40
 * @projectName:尚硅谷javaweb
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody List<User>  name){
        System.out.println("book save"+name);
        return "{'book':'sava'}";
    }
}
