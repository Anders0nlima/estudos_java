package fundamentos.statics;

public class ModificadorStatic {
    public static void main(String[] args) {
       Conta saldoPedro = new Conta();
       Conta saldoCarla = new Conta();


       saldoPedro.depositarContaConjunta(100.00);
        System.out.println(Conta.saldoContaConjunta);
        System.out.println(Conta.saldoContaConjunta);

        saldoCarla.saldo(50.00);
        System.out.println(saldoCarla.saldo);
        System.out.println(saldoPedro.saldo);

    }
}
