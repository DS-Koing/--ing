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
@Table(name = "user")
public class User {

    //유저 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_cd;

    //유저 이름
    @Column(nullable = false)
    private String user_nm;

    //유저 닉네임
    @Column(nullable = false)
    private String user_nknm;

    //유저 비밀번호
    @Column(nullable = false)
    private String user_pw;

    //유저의 덕성 이메일
    @Column(nullable = false)
    private String user_em;

    //생성 날짜
    private LocalDateTime createdAt;

    //유저의 속성 여부 : 0,1로 표시 -> string에서 int로 변경
    @Column(nullable = false)
    private int user_id;
}
