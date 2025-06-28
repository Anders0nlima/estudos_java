package OOP.exercicios.oop4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "Carlos", 500);
        ContaPoupanca cp = new ContaPoupanca(2, "Ana", 5);
        ContaPremium premium = new ContaPremium(3, "Empresa X");

        List<Conta> todasContas = Arrays.asList(cc, cp, premium);

        // Depósitos e saques
        todasContas.forEach(conta -> {
            conta.depositar(1000);
            conta.sacar(300);
        });

        // Operações específicas da conta premium
        premium.transferir(cc, 200);
        premium.aplicarInvestimento(500, 12);

        // Simular rendimento da poupança
        cp.renderJuros(0.01); // 1% de juros

        // Mostrar saldo final
        System.out.println("\n--- Saldo Final ---");
        todasContas.forEach(conta ->
                System.out.println(conta.titular + " - Saldo: " + conta.consultarSaldo()));
    }
}
