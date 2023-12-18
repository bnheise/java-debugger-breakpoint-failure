package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String index() {
    System.out.println("TEST DEBUG");
    System.out.println("TEST DEBUG 2");
    return "Greetings from Spring Boot!";
  }

}
