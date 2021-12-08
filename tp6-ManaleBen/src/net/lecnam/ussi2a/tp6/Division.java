package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Division {

    public Division(){
    }

    public double division1(int a, int b){
        return a/b;
    }

    public double division2(int a, int b){
        try{
            return(a/b);
        }
        catch(Exception ArithmeticException){
            System.out.println("On ne peut pas diviser par 0");
        }
        return 0;
    }

    public double division3(int a, int b) throws IOException{
        try{
            return(a/b);
        }
        catch(ArithmeticException e){
            throw new IOException();
        }
    }

    public double division3bis(int a, int b) throws IOException{
        if (b == 0) {
            throw new IOException();
        }
            return(a/b);
    }
}
