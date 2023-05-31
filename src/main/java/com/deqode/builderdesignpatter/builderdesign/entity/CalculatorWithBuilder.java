package com.deqode.builderdesignpatter.builderdesign.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorWithBuilder {

    String caseColor;
    String buttonColor;
    ArrayList<String> buttons = new ArrayList<>();

    public static class Builder {
        String caseColor;
        String buttonColor;
        boolean isTrig = false;

        boolean isProgramming = false;

        public Builder withCaseColor(String color){
            this.caseColor = color;
            return this;
        }

        public Builder withButtonColor(String buttonColor){
            this.buttonColor = buttonColor;
            return this;
        }

        public Builder withTrigFunction(boolean isTrig){
            this.isTrig = isTrig;
            return this;
        }

        public Builder withProgrammingFunction(boolean isProgramming){
            this.isProgramming = isProgramming;
            return  this;
        }

        public CalculatorWithBuilder build(){
            return new CalculatorWithBuilder(caseColor,buttonColor,isTrig,isProgramming);
        }
    }
    private CalculatorWithBuilder(String caseColor,String buttonColor,boolean isTrig,boolean isProgrammable){
        this.caseColor = caseColor;
        this.buttonColor = buttonColor;
        Arrays.asList("add","subtract","multiply","devide").forEach(buttons::add);
        if(isTrig){
            Arrays.asList("sine","code","tan","cot").forEach(buttons::add);
        }
        if(isProgrammable){
            Arrays.asList("args1","args2","args3","args4").forEach(buttons::add);
        }
    }

    public void describe(){
        buttons.forEach(System.out::println);
    }
}
