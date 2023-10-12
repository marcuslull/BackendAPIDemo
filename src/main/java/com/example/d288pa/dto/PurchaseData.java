package com.example.d288pa.dto;

import com.example.d288pa.entities.Cart;
import com.example.d288pa.entities.CartItem;
import com.example.d288pa.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PurchaseData {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
