package com.deqode.builderdesignpatter.builder.entity;


import com.deqode.builderdesignpatter.builderdesign.entity.CalculatorWithBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCalculatorWithBuilder {


    @Test
    public void shouldCreateCalculator(){
        var builder = new CalculatorWithBuilder
                .Builder()
                .withButtonColor("red")
                .withCaseColor("green")
                .withProgrammingFunction(true)
                .withTrigFunction(true)
                .build();
        builder.describe();
    }
}
