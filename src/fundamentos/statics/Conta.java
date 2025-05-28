package fundamentos.statics;

public class Conta {
   static double saldoContaConjunta; // quando eu coloco static vai aparecer nos dois o
                                     // saldo independentemente em quem colocquei
    double saldo;

   void depositarContaConjunta(double valor){
       saldoContaConjunta += valor; // saldoContaConjunta = saldoContaConjunta + valor;
   }

   void saldo(double valor){
       saldo += valor; // saldo = saldo + valor
   }


}
