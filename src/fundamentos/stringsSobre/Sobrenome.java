package fundamentos.stringsSobre;

public class Sobrenome {
    public static void main(String[] args) {
        String nome = "Anderson Lima";

        int sobrenomePosicao = nome.indexOf(" ") + 1;

        //mostra so o sobrenome (lima), caso eu coloque stringsSobre + 1 vai mostra so o "L"
        System.out.println(nome.substring(sobrenomePosicao, sobrenomePosicao + 1));
    }
}
