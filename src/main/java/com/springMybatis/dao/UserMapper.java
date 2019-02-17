package com.springMybatis.dao;
import com.springMybatis.bean.User;
/**
 * Created by admin on 2019/2/15.
 */
public interface UserMapper {
    User selectUser(Integer id);
}
