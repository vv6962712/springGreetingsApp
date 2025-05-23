package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class hicon {

    @Autowired
    private hiser userService;

    @GetMapping({"", "/", "/home"})
    public String sayHello() {
        return userService.getGreeting();
    }

    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return userService.getGreetingWithName(name);
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return userService.getGreetingWithName(name);
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody hidata user) {
        return userService.getGreetingWithUser(user);
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return userService.getGreetingWithNames(firstName, lastName);
    }
}
