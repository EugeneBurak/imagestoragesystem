package com.imagestoragesystem.app;

import com.imagestoragesystem.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//import com.imagestoragesystem.storage.StorageProperties;

@SpringBootApplication
//@EnableConfigurationProperties(StorageProperties.class)
@ComponentScan(basePackages = "com.imagestoragesystem.controller, com.imagestoragesystem.storage")
@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }

}
