package com.example.PropertyManager.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> goodbye (){
        return ResponseEntity.ok("Good bye");
    }

}
