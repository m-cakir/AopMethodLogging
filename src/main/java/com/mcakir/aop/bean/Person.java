package com.mcakir.aop.bean;

import com.mcakir.aop.annotation.Logger;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Logger
    public String ask(String name){

        return "How are you, " + name + "?";
    }

    @Logger
    public void bye(){

    }
}
