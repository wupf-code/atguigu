package com.wpf.dao;

import com.wpf.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/18 - 20:02
 * @projectName:尚硅谷javaweb
 */
@Repository
public interface UserDao {
    @Select("select * from test.user;")
    List<User> queryUserList();
    @Insert("INSERT INTO test.user (id, name) VALUES (#{id}, #{name});")
    public void save(User user);
    @Update("update test.user set id=#{id},name=#{name} where id = #{id};")
    public void update(User user);
    @Delete("delete from test.user where id = #{id};")
    public void delete(int id);
    @Select("select * from test.user where id = #{id};")
    public User query(int id);
}
