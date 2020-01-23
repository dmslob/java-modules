package com.dmslob.dao;

import com.dmslob.entity.User;
import com.dmslob.entity.internal.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        User user = new User("York");
        users.add(user);
        return users;
    }

    public Admin getAdmin() {
        return new Admin("key");
    }
}
