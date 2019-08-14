package com.ayaz.service;


import com.ayaz.clentsoap.*;
import com.ayaz.dto.AddDTO;
import com.ayaz.dto.DivideDTO;
import com.ayaz.dto.MultiplyDTO;
import com.ayaz.dto.SubtractDTO;

public interface CalculatorService {

    AddResponse add(AddDTO addDTO);
    DivideResponse divide(DivideDTO divideDTO);
    MultiplyResponse multiply(MultiplyDTO multiplyDTO);
    SubtractResponse subtract(SubtractDTO subtractDTO);

}
