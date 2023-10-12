package com.example.d288pa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseResponse {

    private String orderTrackingNumber;

    public PurchaseResponse(String uuid) {
        this.orderTrackingNumber = uuid;
    }
}
