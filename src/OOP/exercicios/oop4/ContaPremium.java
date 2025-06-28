package OOP.exercicios.oop4;

public class ContaPremium extends Conta implements ServicosBancarios {

    public ContaPremium(int numero, String titular) {
        super(numero, titular);
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

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println(titular + " transferiu " + valor + " para " + destino.titular);
        } else {
            System.out.println(titular + " tentou transferir " + valor + " (Saldo insuficiente)");
        }
    }

    @Override
    public void aplicarInvestimento(double valor, int meses) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            double rendimento = valor * 0.02 * meses; // 2% ao mês
            saldo += valor + rendimento;
            System.out.println(titular + " aplicou " + valor + " por " + meses + " meses e ganhou " + rendimento);
        } else {
            System.out.println(titular + " tentou investir " + valor + " (Saldo insuficiente)");
        }
    }
}