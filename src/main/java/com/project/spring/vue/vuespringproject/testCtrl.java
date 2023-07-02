package com.project.spring.vue.vuespringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * testCtrl
 */
@RestController
@RequestMapping("/api")
public class testCtrl {
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello~!";
    }
    
}