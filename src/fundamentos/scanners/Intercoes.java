package fundamentos.scanners;

import java.io.Serializable;
import java.util.Scanner;

public class Intercoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);

        scanner.close();

    }
}
