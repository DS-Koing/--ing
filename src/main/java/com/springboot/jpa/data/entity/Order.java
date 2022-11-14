package com.springboot.jpa.data.entity;

import lombok.*;

import javax.persistence.*;

// lombok 어노테이션 활용 -> 생성된 메소드 확인은 Structure로
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString()
@Table(name="Order")
public class Order {

    //주문서 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ORDER_CD;

    //장바구니 코드(FK)
    //@Column(nullable = false)
    //private Long CART_CD;
}
