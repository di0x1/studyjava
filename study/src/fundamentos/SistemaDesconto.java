package fundamentos;

import java.util.Scanner;

public class SistemaDesconto {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Me informe o valor do produto");
        double valor = teclado.nextDouble();

        System.out.println("Me informe a porcetagem do desconto");
        double porcentagem = teclado.nextDouble();

        double valorf;

        valorf = calcular(valor, porcentagem);

        System.out.println("Desconto " + valorf);

    }

    public static double calcular(double valor, double porcentagem){

        double desconto;

        desconto = valor * (porcentagem / 100);

        double valorf = valor - desconto;

        return valorf;

    }
}
