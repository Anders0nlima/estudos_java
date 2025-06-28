package OOP.exercicios.oop2;

public class ContaBancaria {
    private int codigoCliente;
    private String nomeCliente;
    private double saldo;
    private double saldoInsuficiente;

    public ContaBancaria(int codigoCliente, String nomeCliente){
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.saldoInsuficiente = 0.0;
    }

    public double depositar(double deposito){
        return saldo+=deposito;
    }

    public double sacar(double saque){
        if(saldo < saque){
            System.out.println("Essa operação não é possível, pois seu saldo e isuficiente");
        }
        return saldo-=saque;

    }

    public double consultarDeposito(){
        if(saldo > 0){
            return saldo;
        }
        return saldoInsuficiente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}