package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

// lombok 어노테이션 활용 -> 생성된 메소드 확인은 Structure로
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString()
@Table(name = "menu")
public class Menu {

    //메뉴 코드(PK) : 카테고리 구분
    // 2 : 라멘, 3 : 일식/양식, 4 : 한식/덮밥, 5 : 분식, 7 : 오늘의메뉴
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menu_cd;

    //장바구니 코드(FK)
    //@Column(nullable = false)
    //private Long CART_CD;

}
