package net.lecnam.ussi2a.tp6;

public class FactorialTooLargeArguementException extends Exception{

    public FactorialTooLargeArguementException(long val){
        super("Le nombre "+ val + " est trop grand");
    }
}
