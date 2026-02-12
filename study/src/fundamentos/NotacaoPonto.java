package fundamentos;
//=======Estudando strings========

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X"; //posso usar funcoes dentro da variavel

        s = s.replace("X","Senhora"); //funcao para substituir palavras na string
        s = s.toUpperCase(); //funcao para deixar maiusculo
        s = s.concat("!!!"); //mesma coisa do strcat de c porem mais simples

        System.out.println(s);


        System.out.println("Moreno".toUpperCase());  //posso usar comandos dentro do print

        System.out.println("Linda gata".charAt(4));
        System.out.println(s.length()); //tamanho da string

        String py = "Sapeca";
        System.out.println(py.equals("Sapeca"));// compara as strings


    }
}
