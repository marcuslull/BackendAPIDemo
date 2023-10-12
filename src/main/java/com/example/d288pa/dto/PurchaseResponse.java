package com.example.d288pa.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PurchaseResponse {

    private String orderTrackingNumber;

    public PurchaseResponse(String uuid) {
    }
}
