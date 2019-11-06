package com.lcj.dao;

import com.lcj.model.User;

import java.util.List;

/**
 * @author 李成坚
 * 2019/11/5 - 20:50
 * @Description
 **/

public interface IUserDao {

    /**
     * @Author 李成坚
     * @Description //findUserByUidAndUname
     * @Date 2019/11/5 20:51
     * @Param [user]
     * @return java.util.List<com.lcj.model.User>
     **/
    public List<User> findUserByUidAndUname(Integer uid, String uname);
}
