package com.gri.tutorial.microsertwoclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(path = "/hi")
    public String hi() {
        System.out.println("am called");
        String url = "http://producer/name";
        return restTemplate.getForObject(url, String.class)+ " from eureka client";
    }
}
