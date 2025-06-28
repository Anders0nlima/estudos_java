package OOP.exercicios.oop4;

public class ContaPoupanca extends Conta {
    private int diaAniversario;

    public ContaPoupanca(int numero, String titular, int diaAniversario) {
        super(numero, titular);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou " + valor);
        } else {
            System.out.println(titular + " tentou sacar " + valor + " (Saldo insuficiente)");
        }
    }

    public void renderJuros(double taxa) {
        double rendimento = saldo * taxa;
        saldo += rendimento;
        System.out.println(titular + " recebeu juros de " + rendimento);
    }
}