package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A very basic Demo Boot Starter.
 *
 * @author Hari
 *
 */


@SpringBootApplication(scanBasePackages = { "com.demo" })
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
