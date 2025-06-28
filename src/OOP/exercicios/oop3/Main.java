package OOP.exercicios.oop3;

public class Main {
    public static void main(String[] args) {
      ContaBancaria conta = new ContaBancaria(12345, "Anderson Lima");

      conta.depositar(3000.0);
      conta.sacar(200.0);
      conta.sacar(2800.0);
      System.out.println("valor na conta atual: " + conta.consutarSaldo());
    }
}
