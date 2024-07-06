package com.example.springboot.facade.servicefacade;

import com.example.springboot.facade.domain.Product;
import com.example.springboot.facade.subcomponents.InventoryService;
import com.example.springboot.facade.subcomponents.PaymentService;
import com.example.springboot.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = productId;
        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.productId + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
