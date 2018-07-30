/*
 *  Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 *  All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Software International (Pvt) Limited.
 *
 * hSenid Software International (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.hsm.dao;

import com.hsm.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class UserDAOImplement implements UserDAO {

//    @Autowired
//    private SessionFactory sessionFactory;
//
//
//    public void addUser(User user) {
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<User> getAllUsers() {
//        return sessionFactory.getCurrentSession().createQuery("from User").list();
//    }
//
//    @Override
//    public void deleteUser(Integer userId) {
//        User user = (User) sessionFactory.getCurrentSession().load(User.class, userId);
//        if (null != user){
//            this.sessionFactory.getCurrentSession().delete(user);
//        }
//    }
//
//    @Override
//    public User updateUser(User user) {
//        sessionFactory.getCurrentSession().update(user);
//        return user;
//    }
//
//
//    public User getUser(int userid) {
//        return (User) sessionFactory.getCurrentSession().get(User.class, userid);
//    }
//}
