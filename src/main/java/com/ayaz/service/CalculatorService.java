package com.ayaz.service;


import com.ayaz.clentsoap.*;
import com.ayaz.dto.WebDTO;

public interface CalculatorService {

    AddResponse add(WebDTO addDTO, int uId);
    DivideResponse divide(WebDTO webDTO, int uId);
    MultiplyResponse multiply(WebDTO webDTO, int uId);
    SubtractResponse subtract(WebDTO webDTO, int uId);

}
