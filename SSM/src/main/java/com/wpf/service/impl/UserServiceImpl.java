package com.wpf.service.impl;

import com.wpf.dao.UserDao;
import com.wpf.pojo.User;
import com.wpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 16:03
 * @projectName:尚硅谷javaweb
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public boolean save(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public boolean update(User user) {
        userDao.update(user);
        return true;
    }

    @Override
    public boolean delete(int id) {
        userDao.delete(id);
        return true;
    }

    @Override
    public User query(int id) {
        return userDao.query(id);
    }
}
