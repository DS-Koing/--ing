package com.springboot.jpa.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Cart")
public class Cart {

    //장바구니 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CART_CD;

    //유저 코드(PK)
    //@Column(nullable = false)
    //private Long USER_CD;

    //음식 코드(PK)
    //@Column(nullable = false)
    //private Long SMENU_CD;

    //메뉴 개수
    @Column(nullable = false)
    private Integer CART_CT;

    //추가 옵션
    @Column(nullable = false)
    private Long MENU_CH;

}
