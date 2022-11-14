package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.CartDAO;
import com.springboot.jpa.data.entity.Cart;
import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.repository.CartRepository;
import java.util.Optional;

import com.springboot.jpa.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartDAOImpl implements CartDAO {

    private CartRepository cartRepository;

    @Autowired
    public CartDAOImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart insertCart(Cart cart) {
        Cart savedCart = cartRepository.save(cart);

        return savedCart;
    }

    @Override
    public Cart selectCart(Long Cart_cd) {
        Cart selectedCart = cartRepository.getById(Cart_cd);

        return selectedCart;
    }

    @Override
    public void deleteCart(Long Cart_cd) throws Exception {
        Optional<Cart> selectedCart = cartRepository.findById(Cart_cd);

        if (selectedCart.isPresent()) {
            Cart cart = selectedCart.get();

            cartRepository.delete(cart);
        } else {
            throw new Exception();
        }
    }

//    @Override
//    int sumMoney(String User_cd){
//
//    }
//
//    @Override
//    int countCart(String User_cd, int number){
//
//    }

}
