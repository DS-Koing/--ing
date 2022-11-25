package com.springboot.jpa.data.dto;

import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartResponseDto {

    private Long Cart_cd;

    private Integer Cart_ct;

    private User user;

    private Product product;

}
