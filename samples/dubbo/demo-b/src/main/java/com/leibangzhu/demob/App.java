package com.leibangzhu.demob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private Foo foo;

    @RequestMapping("/")
    String home(){
        String s = foo.hello();
        return s;
    }

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
