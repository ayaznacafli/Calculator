package com.ayaz.dto;

import com.ayaz.validation.ValidInteger;

public class WebDTO {

    @ValidInteger
    private String intA;

    @ValidInteger
    private String intB;

    public String getIntB() {
        return intB;
    }

    public void setIntB(String intB) {
        this.intB = intB;
    }

    public String getIntA() {
        return intA;
    }

    public void setIntA(String intA) {
        this.intA = intA;
    }
}
