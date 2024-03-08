package com.leanerscircle.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the first controller in our application.
 *
 * @author tunan
 */
@RestController
@RequestMapping("/blog")
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String hello() {
        return "hello-world";
    }
}
