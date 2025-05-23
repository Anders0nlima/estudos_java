package fundamentos.condicoes;


import java.util.ArrayList;
import java.util.Scanner;

public class forWhile {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String adicionarNovaTarefa = "s";

        while (adicionarNovaTarefa.equals("s")){
            System.out.println("Adicione uma tarefa: ");
            String tarefa = scanner.nextLine();
            tarefas.add(tarefa);
            System.out.println("Quer adcionar outra? (s ou n)");
            adicionarNovaTarefa = scanner.nextLine();
        }
        System.out.println("\nSuas tarefas");
        for(int i = 0; i < tarefas.size(); i++){
            System.out.println("[ ] " + tarefas.get(i));
        }

    }
}
