package com.springboot.jpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class S_MenuResponseDto {

    private Long SMENU_CD;

    private Long SMENU_PR;

    private String SMENU_NM;

    private Integer SMENU_CH;

}
