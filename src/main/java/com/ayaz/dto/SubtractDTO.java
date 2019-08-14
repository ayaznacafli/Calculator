package com.ayaz.dto;

import com.ayaz.validation.ValidInteger;

public class SubtractDTO {


    @ValidInteger
    private String intA;

    @ValidInteger
    private String intB;


    public String getIntA() {
        return intA;
    }

    public void setIntA(String intA) {
        this.intA = intA;
    }

    public String getIntB() {
        return intB;
    }

    public void setIntB(String intB) {
        this.intB = intB;
    }


}
