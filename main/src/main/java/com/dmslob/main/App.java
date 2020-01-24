package com.dmslob.main;

import com.dmslob.dao.UserDao;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.findAll());

        System.out.println(userDao.getAdmin().getKey());

        Module userDaoModule = UserDao.class.getModule();
        System.out.println(userDaoModule.isNamed());
        System.out.println(userDaoModule.getName());
    }
}
