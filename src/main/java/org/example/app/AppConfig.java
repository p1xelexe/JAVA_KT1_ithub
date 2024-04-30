package org.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "org.example.app")
public class AppConfig {

    @Bean
    public App app() {
        return new App();
    }
}
