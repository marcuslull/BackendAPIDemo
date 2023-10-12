package com.example.d288pa.controllers;

import com.example.d288pa.dto.PurchaseData;
import com.example.d288pa.dto.PurchaseResponse;
import com.example.d288pa.services.CheckoutService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/api/checkout/purchase")
    public PurchaseResponse purchase(@RequestBody PurchaseData purchaseData){

        return checkoutService.processPurchase(purchaseData);
    }


}
