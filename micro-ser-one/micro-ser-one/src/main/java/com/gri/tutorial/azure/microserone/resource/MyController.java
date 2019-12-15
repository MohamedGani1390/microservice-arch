package com.gri.tutorial.azure.microserone.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @GetMapping(path = "/name")
    public String getName() {
        return "This is Gani";
    }
}
