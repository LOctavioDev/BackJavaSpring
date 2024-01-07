package com.daltoneta.CursoSpring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daltoneta.CursoSpring.models.User;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("user")

public class UserController {
    //This brings all users
    @RequestMapping(value = "/", method=RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("Octavio"); 
        user.setLastName("Martinez");
        list.add(user);

        return list;
    }

    //This bring will up a user by id
    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    User get(@PathVariable long id){
        User user = new User();
        user.setName("Octavio"); 
        user.setLastName("Martinez");

        return user;
    }

    //Register user
    @RequestMapping(value = "/", method=RequestMethod.POST)
    User register(@RequestBody User user){
        
        //TODO: register in the database

        return user;
    }

    //Update user
    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    User update(@RequestBody User user){
         
        //TODO: update in the database

        return user;
    }

    //Dalete user
    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    void delete(@PathVariable long id){
        
        //TODO: delete of the database

    }
    
}
