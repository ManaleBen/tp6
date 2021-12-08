package net.lecnam.ussi2a.tp6;

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
}
