package com.tamil.SpringOauth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greet(){
        return "Hello Tamilarasan👋";
    }
}
