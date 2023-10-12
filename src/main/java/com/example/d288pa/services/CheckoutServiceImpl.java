package com.example.d288pa.services;

import com.example.d288pa.dao.CustomerRepository;
import com.example.d288pa.dto.PurchaseData;
import com.example.d288pa.dto.PurchaseResponse;
import com.example.d288pa.entities.Cart;
import com.example.d288pa.entities.CartItem;
import com.example.d288pa.entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private final CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse processPurchase(PurchaseData purchaseData) {

        // get the customer, cart and cartItems
        Customer customer = purchaseData.getCustomer();
        Cart cart = purchaseData.getCart();
        Set<CartItem> cartItems = purchaseData.getCartItems();

        // create UUID
        String uuid = String.valueOf(UUID.randomUUID());

        // add the uuid to the cart
        cart.setOrderTrackingNumber(uuid);

        // add the cartItems to the cart
        cartItems.forEach(cartItem -> cart.getCartItem().add(cartItem));

        // add the cart to the customer
        customer.getCarts().add(cart);

        // persist the customer
        customerRepository.save(customer);

        // create and return response
        return new PurchaseResponse(uuid);
    }
}
