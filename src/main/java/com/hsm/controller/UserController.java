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

package com.hsm.controller;

import com.hsm.model.User;
import com.hsm.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;


/**
 *spring mvc controller containing methods for all the operations.
 */

@Controller
public class UserController {

    //private static final Logger logger = Logger.getLogger(UserController.class);

    public UserController(){
        System.out.println("UserController()");
    }

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User createModel() {
        return new User();
    }

    @RequestMapping(value = "/")
    public ModelAndView listUser(ModelAndView model) throws IOException{
        List<User> listUser = userService.getAllUsers();
        model.addObject("listUser", listUser);
        model.setViewName("home");
        return model;
    }

    //===================================================================================
    /**
     *@RequestMapping(value = "/searchUser", method = RequestMethod.GET)
    public ModelAndView searchUser(HttpServletRequest request){
    int userId = Integer.parseInt(request.getParameter("searchUser"));
    User user = userService.getUser(userId);
    ModelAndView model = new ModelAndView("home");
    model.addObject("user", user);
    return model;
    }

     */

    //=====================================================================================

    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model) {
        User user = new User();
        model.addObject("user", user);
        model.setViewName("UserForm");
        return model;
    }


    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user) {
        if (user.getUser_id() == 0) {
            userService.addUser(user);
        } else {
            userService.updateUser(user);
        }
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public ModelAndView deleteUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(userId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public ModelAndView editUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUser(userId);
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", user);
        return model;
    }


}

