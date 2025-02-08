package com.mystore.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        return new Product();
    }

    @Bean
    public Product bucket() {
        return new Product();
    }

}
