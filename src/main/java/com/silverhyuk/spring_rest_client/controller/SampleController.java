package com.silverhyuk.spring_rest_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String hello() throws Exception {
        Thread.sleep(5000);
        return "hello";
    }

    @GetMapping("/world")
    public String world() throws Exception {
        Thread.sleep(3000);
        return "world";
    }
}
