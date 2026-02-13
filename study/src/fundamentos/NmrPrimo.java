package fundamentos;

import java.util.Scanner;

public class NmrPrimo {

    public static void main(String[] args) {

        int i;
        boolean rec;
        Scanner teclado = new Scanner(System.in);



    }



    public static boolean ehPrimo(int numero){
        int i,x=0;
        for(i=1;i<=numero;i++){
            if(numero%i==0){
               x++;
            }
        }
        if(x == 2){
            return true;
        } else{
            return false;
        }
    }


}

