package com.springboot.jpa.data.dto;

public class ChangeS_MenuNameDto {

    private Long SMENU_CD;

    private String SMENU_NM;

    public ChangeS_MenuNameDto(Long SMENU_CD, String SMENU_NM) {
        this.SMENU_CD = SMENU_CD;
        this.SMENU_NM = SMENU_NM;
    }

    public ChangeS_MenuNameDto() {
    }

    public Long getSMENU_CD() {
        return this.SMENU_CD;
    }

    public String getSMENU_NM() {
        return this.SMENU_NM;
    }

    public void setSMENU_CD(Long SMENU_CD) {
        this.SMENU_CD = SMENU_CD;
    }

    public void setSMENU_NM(String SMENU_NM) {
        this.SMENU_NM = SMENU_NM;
    }

}
