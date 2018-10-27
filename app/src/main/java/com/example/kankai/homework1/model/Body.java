package com.example.kankai.homework1.model;

public class Body {
    private double input;

    public Body(double input){
        this.input = input;
    }

    public double getInput(){
        return this.input;
    }

    public double cal_ctof(){
        double output = (this.input*9/5) + 32;
        return output;
    }

    public double cal_ftoc(){
        double output = (this.input-32)*5/9;
        return output;
    }

}
