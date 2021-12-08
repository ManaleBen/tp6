package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Main {

    public static void exercice1(int a, int b) {
        Division d = new Division();
        System.out.println(d.division1(a,b));
    }

    public static void exercice2(int a, int b) {
        Division d = new Division();
        System.out.println(d.division2(a,b));
    }


    public static void exercice3(int a, int b) {
        Division d = new Division();
        try {
            double res = d.division3(a,b);
            System.out.println(res);
        } catch (IOException e){
            System.out.println("Division par 0");
        }
    }


    public static void main(String[] args){
        //exercice1(10,0);
        //exercice2(10,0);
        exercice3(10,0);

    }
}
