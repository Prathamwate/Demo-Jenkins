package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  @GetMapping("/test")
  String message() {
    return "Hi this is from Test. ";
  }
}
