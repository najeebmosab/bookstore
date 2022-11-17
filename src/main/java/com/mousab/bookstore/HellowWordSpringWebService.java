package com.mousab.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HellowWordSpringWebService {
    @GetMapping
    public String getHelloWord(){
        return  "Hello Word";
    }

}
