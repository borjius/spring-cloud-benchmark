package com.borjius.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final String name;
    private final String version;

    public ClientController(@Value("${user.role}") final String name,
                            @Value("${application.version}") final String version) {
        this.name = name;
        this.version = version;
    }

    @RequestMapping("/")
    public String home() {
        return String.format("Hello %s in version %s", name, version);
    }
}
