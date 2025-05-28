package fundamentos.statics;

public class MainLivro {
    public static void main(String[] args) {
       Livro livro1 = new Livro();
       Livro livro2 = new Livro();
       Livro livro3 = new Livro();


       livro1.adicionarPaginas(100);
       livro2.adicionarPaginas(150);
       livro3.adicionarPaginas(320);

        System.out.println("paginas do livro 1: " + livro1.paginas);
        System.out.println("paginas do livro 2: " + livro2.paginas);
        System.out.println("paginas do livro 3: " + livro3.paginas);

       int totalDeLivros = Livro.getTotalLivros();
       System.out.println(totalDeLivros);


    }
}
