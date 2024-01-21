package com.daltoneta.CursoSpring.dao;

import java.util.List;

import com.daltoneta.CursoSpring.models.User;

public interface UserDao {
    
    List<User> getAll();
    User get(long id);
    User register(User user);
    User update(User user);
    void delete(long id);
    
}