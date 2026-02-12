package fundamentos;

import java.util.Date;

public class temperatura {

    public static void main(String[] args) {

        int i;

        for (i = 0; i < 3; i++) {

            double cel = 20;
            double far = 0;

            far = temp(cel);

            System.out.printf("Temperatura em far %.2f \n", far);


        }

        Date data = new Date();
        System.out.println(data);

    }

    public static double temp(double cel) {

        double div = 9.0 / 5.0;
        int soma = 32;

        return (cel * div) + soma;
    }
}