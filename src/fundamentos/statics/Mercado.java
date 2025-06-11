package fundamentos.statics;

public class Mercado {
    static int totalProduto;
    int produto;


    public Mercado(){
        totalProduto++;
    }

    public void adcionarProduto(int p){
        this.produto += p;
    }

    public static int totalProduto(){
        return totalProduto;
    }
}
