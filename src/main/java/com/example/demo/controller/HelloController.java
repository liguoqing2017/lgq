package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * 欢迎接口 - GET /api/hello
     */
    @GetMapping("/hello")
    public Map<String, Object> hello(@RequestParam(defaultValue = "World") String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello, " + name + "!");
        result.put("timestamp", LocalDateTime.now().toString());
        result.put("status", "success");
        return result;
    }

    /**
     * 系统信息接口 - GET /api/info
     */
    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> result = new HashMap<>();
        result.put("project", "Demo");
        result.put("version", "1.0.0");
        result.put("java", System.getProperty("java.version"));
        result.put("timestamp", LocalDateTime.now().toString());
        return result;
    }

}
