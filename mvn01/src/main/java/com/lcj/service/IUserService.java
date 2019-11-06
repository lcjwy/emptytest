package com.lcj.service;

/**
 * @author 李成坚
 * 2019/11/5 - 20:32
 * @Description
 **/
public interface IUserService {

    /**
     * @Author 李成坚
     * @Description //用户登录
     * @Date 2019/11/5 20:37
     * @Param [user] 用户的信息
     * @return java.util.List<com.lcj.model.User>
     **/
    public boolean login(Integer uid, String uname);
}
