package com.deqode.builderdesignpatter.builderdesign.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    String caseColor;
    String buttonColor;
    ArrayList<String> buttons = new ArrayList<>();

    public Calculator(boolean isTrig,boolean isProgrammable){
        this("blue","yellow",isTrig,isProgrammable);
    }

    public Calculator(){
        this("blue","yellow",false,false);
    }

    public Calculator(boolean isTrig){
        this("blue","yellow",isTrig,false);
    }

    public Calculator(String caseColor,boolean isTrig,boolean isProgrammable){
        this(caseColor,"Yellow",isTrig,isProgrammable);
    }

    public Calculator(String caseColor,String buttonColor,boolean isTrig,boolean isProgrammable){
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
