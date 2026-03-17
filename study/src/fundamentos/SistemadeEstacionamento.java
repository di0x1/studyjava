package fundamentos;

import java.util.Scanner;

public class SistemadeEstacionamento {
        static String[] vagas = new String[10];
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while(opcao!=4) {

        System.out.println("1 - Estacionar carro");
        System.out.println("2 - Retirar carro");
        System.out.println("3 - Mostrar vagas");
        System.out.println("4 - Encerrar sistema");
        opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    Estacionamento();
                    break;

                case 2:
                    RetiraEstacionamento();
                    break;

                case 3:
                    MostrarVagas();
                    break;

                case 4:
                    break;
            }
        }
    }
    public static void Estacionamento (){
        Scanner teclado = new Scanner(System.in);
        if(VagasOcupadas()<10){
            System.out.println("Digite a placa do carro: ");
            String placa = teclado.next();
            Vagas(placa);
        }
    }

    public static void Vagas(String placa) {
        int x = 0;
        for (int i = 0; i < 10 && x == 0; i++) {
            if (vagas[i] == null) {
                vagas[i] = placa;
                x = 1;
            }
        }
    }

    public static int VagasOcupadas() {

            int ctd = 0;
            for (int i = 1; i < 10; i++) {
                if (vagas[i] != null) {
                    ctd++;
                }
            }
            return ctd;
    }

    public static void RetiraEstacionamento (){
        int x = 0;
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a placa do carro que deseja retirar: ");
            String retira = teclado.next();
            RetirarCarro(retira);

    }

    public static void RetirarCarro(String retira) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].equals(retira)) {
                vagas[i] = null;
                System.out.println("Carro retirado com sucesso!");
                return;
            }
            System.out.println("Carro Nao Encontrado!");
            break;
        }
    }

    public static void MostrarVagas() {
        for (int i = 0; i < 10; i++) {
           System.out.println("Vagas que estao sendo ocupadas:"+vagas[i]+"  Pocisao da vaga:"+(i + 1));
        }
    }
}
