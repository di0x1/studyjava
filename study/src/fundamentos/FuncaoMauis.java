package fundamentos;

import java.util.Scanner;

public class FuncaoMauis {
    public static void main(String[] args){

        Scanner teclado =  new Scanner(System.in);

        System.out.println("Minuscula");
        String pal = teclado.nextLine();

        String resultado = Mauisc(pal);
        System.out.printf("\n Palavra em maiuscula %s \n", resultado);


    }

    public static String Mauisc(String pal){

        return pal.toUpperCase();
    }
}
