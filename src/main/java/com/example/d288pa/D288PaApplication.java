package com.example.d288pa;

import com.example.d288pa.bootstrap.DataLoad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class D288PaApplication {

    public static void main(String[] args) {
        SpringApplication.run(D288PaApplication.class, args);
    }

    @Bean
    public DataLoad schedulerRunner() {
        return new DataLoad();
    }

}
