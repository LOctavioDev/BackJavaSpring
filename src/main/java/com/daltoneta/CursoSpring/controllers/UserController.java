package com.daltoneta.CursoSpring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daltoneta.CursoSpring.models.User;

@RestController
@RequestMapping("user")

public class UserController {
    //ESTA FUNCION TRAE A TODOS LOS USUARIOS
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List <User> getAll() {
        List<User> list = new ArrayList<>();
        User user =  new User();
        user.setName("Octavio");
        user.setLastname("Lopez");
        list.add(user);
        return list;
    }

    //REGISTRAR A LOS USUARIOS
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user) {
        //TODO: REGISTRARLO EN LA BASE DE DATOS
        return user;
    }

    //ACTUALIZAR A LOS USUARIOS
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user) {
        //TODO: ACTUALIZARO EN LA BASE DE DATOS
        return user;
    }

    //ELIMINAR A LOS USUARIOS
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        //TODO: ELIMINARLO EN LA BASE DE DATOS
        User user =  new User();
        user.setName("Octavio");
        user.setLastname("Lopez");
    }

}
