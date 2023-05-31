package com.deqode.builderdesignpatter.builder.entity;

import com.deqode.builderdesignpatter.builderdesign.entity.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCalculator {


    @Test
    public void shouldCreateCalculator(){
        String caseColor = "";
        String buttonColor = "";
        boolean isTrig = true;
        boolean isProgrammable=false;
        Calculator calculator = new Calculator(caseColor,buttonColor,isTrig,isProgrammable);
        calculator.describe();
    }
}
