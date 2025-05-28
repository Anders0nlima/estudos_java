package fundamentos.statics;

public class Livro {
    static int totalLivros; //conta quantos livros tem
    int paginas; //conta quantas paginas o livro tem


   // contrutor padrao que vai contar os livros automaticamente
    public Livro(){
      totalLivros++; //inclementa ao contador de livros
    }

    //metodo para adicionar paginas
    public void adicionarPaginas(int p){
       this.paginas += p;  // soma p ao total de paginas
    }

    public static int getTotalLivros(){
        return totalLivros;
    }

}
