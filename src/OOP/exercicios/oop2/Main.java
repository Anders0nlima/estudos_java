package OOP.exercicios.oop2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "Anderson Lima");

        conta.depositar(1000.0);
        conta.sacar(900.0);
        conta.depositar(30.0);
        conta.sacar(140);

        if(conta.consultarDeposito() < 0){
            System.out.println("A conta do Sr." + conta.getNomeCliente() + ", pelo codigo " + conta.getCodigoCliente() + ","+ "é insuficiente para a operção " + conta.consultarDeposito());
        } else{
            System.out.println("valor atual de seu saldo: " +conta.consultarDeposito());
        }
    }
}
