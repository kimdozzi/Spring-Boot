package com.example.springboot.facade.controller;

import com.example.springboot.facade.servicefacade.OrderServiceFacadeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller = new OrderFulfillmentController();
        OrderServiceFacadeImpl facade = new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result = controller.orderFulfilled;
        Assertions.assertTrue(result);
    }
}
