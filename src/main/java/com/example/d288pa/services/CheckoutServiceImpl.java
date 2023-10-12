package com.example.d288pa.services;

import com.example.d288pa.dao.CartRepository;
import com.example.d288pa.dao.CustomerRepository;
import com.example.d288pa.dto.PurchaseData;
import com.example.d288pa.dto.PurchaseResponse;
import com.example.d288pa.entities.Cart;
import com.example.d288pa.entities.CartItem;
import com.example.d288pa.entities.Customer;
import com.example.d288pa.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private final CartRepository cartRepository;

    public CheckoutServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
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
        cartItems.forEach(cartItem -> cart.add(cartItem));

        // add the customer to the cart
        cart.setCustomer(customer);

        // update the status
        cart.setStatus(StatusType.ordered);

        // persist the cart
        try {
            cartRepository.save(cart);
        }
        catch (Exception e) {
            throw new RuntimeException("Cannot persist cart");
        }


        // create and return response
        return new PurchaseResponse(uuid);
    }
}
