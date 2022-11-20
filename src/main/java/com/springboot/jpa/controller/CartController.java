package com.springboot.jpa.controller;

import com.springboot.jpa.data.dto.CartDto;
import com.springboot.jpa.data.dto.CartResponseDto;
import com.springboot.jpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping()
    public ResponseEntity<CartResponseDto> getCart(Long Cart_cd) {
        CartResponseDto cartResponseDto = cartService.getCart(Cart_cd);

        return ResponseEntity.status(HttpStatus.OK).body(cartResponseDto);
    }

    @PostMapping()
    public ResponseEntity<CartResponseDto> createCart(@RequestBody CartDto cartDto) {
        CartResponseDto cartResponseDto = cartService.saveCart(cartDto);

        return ResponseEntity.status(HttpStatus.OK).body(cartResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteCart(Long Cart_cd) throws Exception {
        cartService.deleteCart(Cart_cd);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

}
