package fundamentos.statics;

public class MainMercado {
    public static void main(String[] args) {
        Mercado produto1 = new Mercado();
        Mercado produto2 = new Mercado();
        Mercado produto3 = new Mercado();

        produto1.adcionarProduto(10);
        produto2.adcionarProduto(10);
        produto3.adcionarProduto(30);
        System.out.println("total de produto 1 no mercado: " + produto1.produto);

        System.out.println(Mercado.totalProduto());
    }
}
