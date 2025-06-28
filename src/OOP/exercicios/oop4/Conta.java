package OOP.exercicios.oop4;

public abstract class Conta {
    protected int numero;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(titular + " depositou " + valor);
        }
    }

    public abstract void sacar(double valor);

    public double consultarSaldo() {
        return saldo;
    }
}