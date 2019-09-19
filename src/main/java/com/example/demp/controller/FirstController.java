package com.example.demp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author cdx
 */
@RestController
public class FirstController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hello Git777";
    }
}

