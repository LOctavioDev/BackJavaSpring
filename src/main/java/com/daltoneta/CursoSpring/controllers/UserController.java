package com.daltoneta.CursoSpring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.daltoneta.CursoSpring.models.User;
import com.daltoneta.CursoSpring.services.UserService;


@RestController
@RequestMapping("user")

public class UserController {

    UserService userService;

    //This brings all users
    @RequestMapping(value = "/", method=RequestMethod.GET)
    List<User> getAll(){
        return userService.getAll();
    }

    //This bring will up a user by id
    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    User get(@PathVariable long id){
        return userService.get(id);
    }

    //Register user
    @RequestMapping(value = "/", method=RequestMethod.POST)
    User register(@RequestBody User user){
        return userService.register(user);
    }

    //Update user
    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    User update(@RequestBody User user){
        return userService.update(user);
    }

    //Delete user
    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    void delete(@PathVariable long id){
        userService.delete(id);

    }
    
}
