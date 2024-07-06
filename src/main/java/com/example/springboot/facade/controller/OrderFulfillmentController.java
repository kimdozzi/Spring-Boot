package com.example.springboot.facade.controller;

import com.example.springboot.facade.servicefacade.OrderServiceFacade;
import com.example.springboot.facade.servicefacade.OrderServiceFacadeImpl;

public class OrderFulfillmentController {

    OrderServiceFacade facade = new OrderServiceFacadeImpl();

    boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. Order Id: " + productId);
    }
}
