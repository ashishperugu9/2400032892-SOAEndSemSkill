package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/ms1")
public class AdditionController {

    @GetMapping("/add")
    public Map<String, Integer> add(
            @RequestParam int a,
            @RequestParam int b) {

        int result = a + b;

        return Map.of("result", result);
    }
}