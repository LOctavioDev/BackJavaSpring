package com.daltoneta.CursoSpring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")

public class UserController {
    
    @RequestMapping(value = "/holamundo", method = RequestMethod.GET)
    String holaMundo() {
        return "Hola Mundo";
    }
}
