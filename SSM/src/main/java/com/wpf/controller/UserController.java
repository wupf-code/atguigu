package com.wpf.controller;

import com.wpf.pojo.User;
import com.wpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 16:03
 * @projectName:尚硅谷javaweb
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> queryUserList() {
        return userService.queryUserList();
    }

    @PostMapping()
    public boolean save(@RequestBody User user) {
        userService.save(user);
        return true;
    }

    @PutMapping()
    public boolean update(@RequestBody User user) {
        userService.update(user);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        userService.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public User query(@PathVariable int id) {
        return userService.query(id);
    }
}
