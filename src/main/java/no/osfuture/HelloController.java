package no.osfuture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Witam na stronie poświęconej open source, aktualny czas to: " + new Date() + "\n";
    }
}
