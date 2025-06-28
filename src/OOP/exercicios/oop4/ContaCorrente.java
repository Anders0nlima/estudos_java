package OOP.exercicios.oop4;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limiteChequeEspecial = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou " + valor);
        } else {
            System.out.println(titular + " tentou sacar " + valor + " (Saldo insuficiente)");
        }
    }
}
