package com.devops.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<h1>🚀 DevOps CI/CD Pipeline Working!</h1>" +
               "<p>Deployed via Jenkins → Docker → Kubernetes</p>";
    }
}
