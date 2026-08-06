package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("========================================");
        System.out.println("  Demo 启动成功!");
        System.out.println("  访问地址: http://localhost:8080");
        System.out.println("  健康检查: http://localhost:8080/actuator/health");
        System.out.println("========================================");
    }

}
