package com.daltoneta.CursoSpring.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daltoneta.CursoSpring.models.User;

public interface UserDao {
   
    List <User> getAll();

    User register(@RequestBody User user);

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
