package com.lcj.dao.Impl;

import com.lcj.dao.IUserDao;
import com.lcj.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author 李成坚
 * 2019/11/5 - 20:52
 * @Description
 **/

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }


    @Override
    public List<User> findUserByUidAndUname(Integer uid, String uname) {
        String hql = "FROM User where uid = '" + uid+ "'" + "and uname = '" + uname+"'";
        Query query = getSession().createQuery(hql);
        List<User> userList = (List<User>)query.list();
        return userList;

    }
}
