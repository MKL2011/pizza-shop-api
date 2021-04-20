package com.cheesey.pizzashopapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PizzaController {

    @RequestMapping(value = "/pizzas")
    private String getPizzaCode() {
        return "Pizza Code is now available on amazon web services !";
    }

}
