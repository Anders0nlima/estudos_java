package OOP.exercicios.oop3;

public class ContaBancaria {
    private int codigoCliente;
    private String nomeCliente;
    private double saldo;


    public ContaBancaria(int codigoCliente, String nomeCliente){
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo+=valor;
            System.out.println("valor de " + valor + " depositado com sucesso");
        } else {
            System.out.println("valor invalido");
        }
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.println("valor invalido");
            return false;
        }

        if(saldo >= valor){
           saldo-=valor;
            System.out.println("valor de " + valor + " sacado com sucesso");
           return true;
        } else{
            System.out.println("saldo infuficiente");
            return false;
        }
    }

    public double consutarSaldo(){
        return saldo;
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
