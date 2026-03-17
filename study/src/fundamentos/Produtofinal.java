package fundamentos;

public class Produtofinal {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "iphone";
        p1.preco = 1500;
        p1.quantidade = 10;

        var p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 700;
        p2.quantidade = 10;

        System.out.println("Media do carrinho "+ ((p1.preco + p2.preco) / 2));
    }
}
