package com.lambdaschool.restaurants.service;

import com.lambdaschool.restaurants.RestaurantsApplication;
import com.lambdaschool.restaurants.model.Restaurant;
import com.lambdaschool.restaurants.model.RestaurantPayments;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantsApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestaurantServiceImplTest {
    @Autowired
    private RestaurantService restaurantService;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this );
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void AfindAll() {
        assertEquals(3, restaurantService.findAll().size());
    }

    @Test
    public void BfindRestaurantById() {
        assertEquals("Eagle Cafe", restaurantService.findRestaurantById(10L).getName());
    }

    @Test
    public void CfindRestaurantByName() {
    }

    @Test
    public void Zdelete() {
        restaurantService.delete(13L);
        assertEquals(2, restaurantService.findAll().size());
    }

    @Test(expected = EntityNotFoundException.class)
    public void ZdeleteNotFound() {
        restaurantService.delete(100L);
        assertEquals(2, restaurantService.findAll().size());
    }

    @Test
    public void Dsave() {
    }

    @Test
    public void Eupdate() {
        ArrayList<RestaurantPayments> thisPay = new ArrayList<>();
        Restaurant r1 = new Restaurant(null, null, null, "ZZ", null, thisPay);
        r1.setRestaurantid(10L);
        Restaurant updateR1 = restaurantService.update(r1, 10);

        assertEquals("ZZ", updateR1.getState());
    }
}