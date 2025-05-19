package GastroOrderAndPaySystem.GOAPS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "✅ Hello from /test — everything works!";
    }
}
