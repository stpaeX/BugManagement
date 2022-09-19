package com.example.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class testController {
    @GetMapping("/hello/{name}")
    public String printStuff(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
