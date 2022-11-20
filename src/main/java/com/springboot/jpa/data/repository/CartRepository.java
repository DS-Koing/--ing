package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
