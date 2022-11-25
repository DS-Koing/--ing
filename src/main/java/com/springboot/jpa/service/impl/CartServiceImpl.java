package com.springboot.jpa.service.impl;

import com.springboot.jpa.data.dao.CartDAO;
import com.springboot.jpa.data.dto.CartDto;
import com.springboot.jpa.data.dto.CartResponseDto;
import com.springboot.jpa.data.entity.Cart;
import com.springboot.jpa.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CartServiceImpl implements CartService {

    private final CartDAO cartDAO;

    @Autowired
    public CartServiceImpl(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    public CartResponseDto getCart(Long Cart_cd) {
        Cart cart = cartDAO.selectCart(Cart_cd);

        CartResponseDto cartResponseDto = new CartResponseDto();
        cartResponseDto.setCart_cd(cart.getCart_cd());
        cartResponseDto.setCart_ct(cart.getCart_ct());
        cartResponseDto.setUser(cart.getUser());
        cartResponseDto.setProduct(cart.getProduct());

        return cartResponseDto;
    }

    @Override
    public CartResponseDto saveCart(CartDto cartDto) {
        Cart cart = new Cart();
        cart.setCart_ct(cartDto.getCart_ct());
        cart.setUser(cartDto.getUser());
        cart.setProduct(cartDto.getProduct());

        Cart savedCart = cartDAO.insertCart(cart);

        CartResponseDto cartResponseDto = new CartResponseDto();
        cartResponseDto.setCart_ct(savedCart.getCart_ct());
        cartResponseDto.setUser(savedCart.getUser());
        cartResponseDto.setProduct(savedCart.getProduct());

        return cartResponseDto;
    }

    @Override
    public void deleteCart(Long Cart_cd) throws Exception {
        cartDAO.deleteCart(Cart_cd);
    }

}
