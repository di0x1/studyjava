package fundamentos;
// ESTUDAR PASSAGEM POR REFERENCIA!!!!!!!!!!!!!!!!!!!
package fundamentos;

public class temperatura {

    // MÉTODO SIMPLES
    public static double pika(double cel) {
        final double div = 9.0 / 5.0;
        final int soma = 32;

        return (cel * div) + soma;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            double cel = 20 + i;

            double far = pika(cel); // recebe o resultado

            System.out.printf("Temperatura em far %.2f%n", far);
        }
    }
}

