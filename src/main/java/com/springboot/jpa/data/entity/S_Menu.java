package com.springboot.jpa.data.entity;

import javax.persistence.*;

@Entity
@Table(name="S_Menu")
public class S_Menu {

    //음식 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SMENU_CD;

    //메뉴 코드(FK)
    //@Column(nullable = false)
    //private Long MENU_CD;

    //음식 가격
    @Column(nullable = false)
    private Long SMENU_PR;

    //음식 이름
    @Column(nullable = false)
    private String SMENU_NM;

    //음식 개수
    @Column(nullable = false)
    private Integer SMENU_CH;

    public void setSMENU_NM(String smenu_nm) {
        this.SMENU_NM = smenu_nm;
    }
}
