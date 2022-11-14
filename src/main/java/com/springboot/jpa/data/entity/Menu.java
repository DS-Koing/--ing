package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "menu")
public class Menu {

    //메뉴 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menu_cd;

    //장바구니 코드(FK)
    //@Column(nullable = false)
    //private Long CART_CD;

}
