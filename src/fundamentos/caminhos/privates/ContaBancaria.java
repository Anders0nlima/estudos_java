package fundamentos.caminhos.privates;

public class ContaBancaria {
   private double saldo;

   public void depositar(double valor){
       saldo = saldo + valor;
   }

   public void displaySaldo(){
        System.out.println("Sua conta tem: " + saldo);
   }
}
