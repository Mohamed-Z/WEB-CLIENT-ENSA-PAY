package com.ensas.webclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebclientApplication {

    /*CmiWebService proxy = new CmiWS().getCmiWebServicePort();
    @Autowired
    ClientRepository clientRepository;*/


    public static void main(String[] args) {
        SpringApplication.run(WebclientApplication.class, args);
    }

    @Bean
    CommandLineRunner start() {
        return args -> {

            //clientRepository.login("0649735026","1234");

            //proxy.getSolde();

        };
    }

}
