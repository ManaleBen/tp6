package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Factorielle {

    public long calcul(String val) throws IOException, FactorialNegativeArgumentException, FactorialTooLargeArguementException {
        if (val == null){
            throw new IOException("Le paramètre est null");
        }

        long vallong = 0;
        try {
            long vallong = Long.parseLong(val);
        } catch (NumberFormatException ex){
            throw new IOException("Le paramètre n'est pas un nombre");
        }
        if (val < 0){
            throw new FactorialNegativeArgumentException(vallong);
        }
        if (val > 20){
            throw new FactorialTooLargeArguementException(vallong);
        }


        int factorielle = 1;
        for (int i = 1; i <= vallong; i++){
            factorielle *= i;
        }
        return factorielle;
    }
}
