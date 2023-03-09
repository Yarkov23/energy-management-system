package com.example.energymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EnergyManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnergyManagementApplication.class, args);
    }

}
