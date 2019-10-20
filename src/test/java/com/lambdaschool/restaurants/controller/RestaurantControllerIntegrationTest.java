package com.lambdaschool.restaurants.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestaurantControllerIntegrationTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }
}
