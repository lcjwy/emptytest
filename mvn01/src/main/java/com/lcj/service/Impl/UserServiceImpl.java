package com.lcj.service.Impl;

import com.lcj.dao.IUserDao;
import com.lcj.model.User;
import com.lcj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李成坚
 * 2019/11/5 - 20:38
 * @Description
 **/

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public boolean login(Integer uid, String uname) {
        List<User> userList = userDao.findUserByUidAndUname(uid, uname);
        for (User user:userList) {
            System.out.println(user.toString());
        }
        if (userList.size()==1) {
            return true;
        } else {
            return false;
        }
    }
}
