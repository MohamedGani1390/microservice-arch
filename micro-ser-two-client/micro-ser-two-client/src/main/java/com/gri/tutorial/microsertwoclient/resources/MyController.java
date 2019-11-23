package com.gri.tutorial.microsertwoclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eureka/client")
public class MyController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(path = "/hi")
    public String hi() {
        String url = "http://eureka-server/eureka/server/name";
        return restTemplate.getForObject(url, String.class)+ " from eureka client";
    }
}
