package fundamentos.arrayBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*String [] tarefas = {"ler livro", "aprender java", "manutenção do selo"};

        System.out.println(tarefas[1]);
        System.out.println(tarefas.length);
        System.out.println(Arrays.toString(tarefas));*/

        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("estudar java");
        tarefas.add("correr");
        tarefas.add("ir para a faculdade");
        System.out.println(tarefas.size());
    }
}
