package io.alishrf.divar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DivarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DivarApplication.class, args);

    }

}
