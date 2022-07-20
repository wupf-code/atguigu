package com.wpf.service;

import com.wpf.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 16:02
 * @projectName:尚硅谷javaweb
 */
@Transactional
public interface UserService {
    List<User> queryUserList();
    boolean save(User user);
    boolean update(User user);
    boolean delete(int id);
    User query(int id);
}
