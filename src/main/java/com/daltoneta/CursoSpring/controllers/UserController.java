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
    //Bring all users
    @RequestMapping(value = "/", method=RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("Octavio"); 
        user.setLastName("Martinez");
        list.add(user);

        return list;
    }
    
}
