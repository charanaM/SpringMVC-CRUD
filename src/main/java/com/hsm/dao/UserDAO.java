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

import java.util.List;

/**
 * User data access object
 */

public interface UserDAO {

    public void addUser(User user);

    public List<User> getAllUsers();

    public void deleteUser(Integer userId);

    public User updateUser(User user);

    public User getUser(int userid);

}
