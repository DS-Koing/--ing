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
@Table(name="Cart")
public class Cart {

    //장바구니 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cart_cd;

    //유저 코드(PK)
    @ManyToOne
    @JoinColumn(name = "User_cd")
    private User user;

    //음식 코드(PK)
    @ManyToOne
    @JoinColumn(name = "number")
    private Product product;

    //메뉴 개수
    @Column(nullable = false)
    private Integer Cart_ct;

    //추가 옵션
//    @Column(nullable = false)
//    private Long MENU_CH;

}
