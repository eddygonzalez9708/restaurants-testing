package com.lambdaschool.restaurants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO Integration-testing

// @EnableJpaAuditing
@SpringBootApplication
public class RestaurantsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RestaurantsApplication.class, args);
    }
}
