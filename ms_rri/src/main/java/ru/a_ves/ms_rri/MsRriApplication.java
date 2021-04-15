package ru.a_ves.ms_rri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "ru.a_ves.ms_core")
public class MsRriApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRriApplication.class, args);
    }

}
