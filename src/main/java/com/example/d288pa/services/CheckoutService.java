package com.example.d288pa.services;

import com.example.d288pa.dto.PurchaseData;
import com.example.d288pa.dto.PurchaseResponse;

public interface CheckoutService {

    public PurchaseResponse processPurchase(PurchaseData purchaseData);
}
