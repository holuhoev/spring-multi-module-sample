package ru.hse.infotouch.terminal;

import ru.hse.infotouch.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "ru.hse.infotouch")
@RestController
public class TerminalApplication {

    private final MyService myService;

    public TerminalApplication(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(TerminalApplication.class, args);
    }
}