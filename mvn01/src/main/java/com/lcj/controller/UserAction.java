package com.lcj.controller;

import com.lcj.model.User;
import com.lcj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Description  UserAction控制层
 * @author 李成坚
 * 2019/11/5$ - 20:00$
 **/

@Controller
public class UserAction extends BaseAction{
    private int uid;  //用户id
    private String uname;  //用户姓名

    private User user;


    @Autowired
    private IUserService userService;


    public String userLogin() {
        boolean islogin = userService.login(uid,uname);   //使用时不能用user对象，只能传递属性
        if (islogin) {
            return "success";
        } else {
            return "failed";
        }
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
