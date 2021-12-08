package net.lecnam.ussi2a.tp6;

public class Main {

    public static void exercice1(int a, int b) {
        Division d = new Division();
        System.out.println(d.division1(a,b));
    }
    public static void exercice2(int a, int b) {
        Division d = new Division();
        System.out.println(d.division2(a,b));
    }
    public static void main(String[] args){
        //exercice1(10,0);
        exercice2(10,0);

    }
}
