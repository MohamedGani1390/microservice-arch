package com.gri.tutorial.azure.microserone.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka/server")
public class MyController {

    @GetMapping(path = "/name")
    public String getName() {
        return "This is Gani";
    }
}
