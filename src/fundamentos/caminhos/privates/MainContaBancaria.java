package fundamentos.caminhos.privates;

public class MainContaBancaria {
    public static void main(String[] args) {
      ContaBancaria conta = new ContaBancaria();

      conta.depositar(200.0);
      //conta.saldo é privado

      conta.displaySaldo();

    }
}
