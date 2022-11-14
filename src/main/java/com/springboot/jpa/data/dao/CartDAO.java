package com.springboot.jpa.data.dao;

import com.springboot.jpa.data.entity.Cart;

public interface CartDAO {

    Cart insertCart(Cart cart);

    Cart selectCart(Long Cart_cd);

    void deleteCart(Long Cart_cd) throws Exception;

//    int sumMoney(String User_cd); //장바구니 금액 합계
//
//    int countCart(String User_cd, int number); //장바구니 상품 갯수

}
