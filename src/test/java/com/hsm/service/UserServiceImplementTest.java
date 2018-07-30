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

package com.hsm.service;

import com.hsm.dao.UserDAO;
import com.hsm.model.User;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * test case class
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-servlet.xml"})
public class UserServiceImplementTest {

    @Autowired
    public UserDAO userDAO;

    //test method for get all users
    @Test
    public void getAllUsers() {
        List<User> user_list = userDAO.getAllUsers();
        Assert.assertNotNull(user_list);
    }

    //test method for adding a user
    @Test
    public void addUserTest() {
        userDAO.addUser(new User("Test", "10", "aa", "bb", "cc"));
    }

    //test method for updating a user
    @Test
    public void testUpdateUser() {
        userDAO.updateUser(new User("Test", "10", "aa", "bb", "cc"));
    }

    //test method for deleting a user
    @Test
    public void testDeleteUser() {
        userDAO.deleteUser(16);
    }
}