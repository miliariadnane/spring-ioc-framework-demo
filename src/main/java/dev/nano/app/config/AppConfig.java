package dev.nano.app.config;

import dev.nano.core.annotation.Bean;
import dev.nano.core.annotation.ComponentScan;

@ComponentScan(basePackages = "dev.nano.app")
public class AppConfig {

    @Bean(name = "string")
    public String string() {
        return "Hello World";
    }
}
