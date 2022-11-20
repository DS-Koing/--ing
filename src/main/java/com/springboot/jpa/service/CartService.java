package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.CartDto;
import com.springboot.jpa.data.dto.CartResponseDto;

public interface CartService {

    CartResponseDto getCart(Long Cart_cd);

    CartResponseDto saveCart(CartDto cartDto);

    void deleteCart(Long Cart_cd) throws Exception;

}
