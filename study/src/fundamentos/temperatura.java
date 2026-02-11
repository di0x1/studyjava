package fundamentos;

public class temperatura {
    public static void main(String[] args){

int i;

    for(i=0; i<3; i++){

            double cel = 20;
            double far = 0;
            final double div = 9.0 / 5.0;
            final int soma = 32;

            far = (cel * div) + soma;
            pika();

            System.out.printf("Temperatura em far %.2f \n", far);
        }
    }
    public static void pika(){

        System.out.printf("0 \n");

    }
}
