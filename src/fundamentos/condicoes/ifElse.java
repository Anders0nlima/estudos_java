package fundamentos.condicoes;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("____________________________");
        System.out.println("Bem-vindo(a) ao consulturio: temos as seguintes opções:");
        System.out.println("1.limpeza");
        System.out.println("2.obturação");
        System.out.println("3.aparelho");
        System.out.println("4.cirurgia");
        System.out.println("Digite a opção desejada:");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.close();

       /* if(opcao == 1){
            System.out.println("sua limpeza está sendo pronta");
        } else if (opcao == 2) {
            System.out.println("sua abturação será preparada");
        } else if (opcao == 3) {
            System.out.println("seu aparelho sera pronto");
        } else if (opcao == 4) {
            System.out.println("vamos fazer a cirurgia");
        } else {
            System.out.println("opção nao valida");
        }*/

       /* switch (opcao){
            case 1 -> {
                System.out.println("sua limpeza está sendo pronta");
            }
            case 2 -> {
                System.out.println("sua abturação será preparada");
            }
            case 3 -> {
                System.out.println("seu aparelho sera pronto");
            }
            case 4 -> {
                System.out.println("vamos fazer a cirurgia");
            }
            default -> {
                System.out.println("opção nao valida");
            }

        }*/

        // como podemos melhorar: vamos tirar o sout esta se repetindo muito
        String mensagem = switch (opcao){
            case 1 -> "sua limpeza está sendo pronta";
            case 2 -> "sua abturação será preparada";
            case 3 -> "seu aparelho sera pronto";
            case 4 -> "vamos fazer a cirurgia";
            default -> "opção nao valida";
        };
        System.out.println(mensagem);

    }
}
