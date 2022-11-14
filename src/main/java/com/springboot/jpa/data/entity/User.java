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
@Table(name = "user")
public class User {

    //유저 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long User_cd;

    //유저 이름
    @Column(nullable = false)
    private String User_nm;

    //유저 닉네임
    @Column(nullable = false)
    private String User_nknm;

    //유저 비밀번호
    @Column(nullable = false)
    private String User_pw;

    //유저의 덕성 이메일
    @Column(nullable = false)
    private String User_em;

    //생성 날짜
    private LocalDateTime CreatedAt;

    //유저의 속성 여부 : 0,1로 표시 -> string에서 int로 변경
    @Column(nullable = false)
    private int User_id;
}
