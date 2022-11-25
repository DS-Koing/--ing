package com.springboot.jpa.data.dto;

import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CartDto {

    private Integer Cart_ct;

    private User user;

    private Product product;

//    private Long MENU_CH;

}
