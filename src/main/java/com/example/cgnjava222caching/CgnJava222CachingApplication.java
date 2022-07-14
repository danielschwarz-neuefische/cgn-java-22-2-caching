package com.example.cgnjava222caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CgnJava222CachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgnJava222CachingApplication.class, args);
    }

}
