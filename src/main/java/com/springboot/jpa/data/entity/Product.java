package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

// 예제 6.6, 예제 6.30, 6.31, 6.32, 6.33, 6.34, 6.35, 6.36, 6.37
// lombok 어노테이션 활용 -> 생성된 메소드 확인은 Structure로
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number; //상품 코드

    @Column(nullable = false)
    private Integer menu_code; // 카테고리 코드

    @Column(nullable = false)
    private String name; // 상품 이름

    @Column(nullable = false)
    private Integer price; // 상품 가격

    @Column(nullable = false)
    private Integer stock; // 상품 재고

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
