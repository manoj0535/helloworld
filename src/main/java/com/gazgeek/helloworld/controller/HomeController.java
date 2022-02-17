package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "Keeli kotta bombe anthe ee bhoomi maja noduthiruva benami neli haari horata meravanige";
    }

}
