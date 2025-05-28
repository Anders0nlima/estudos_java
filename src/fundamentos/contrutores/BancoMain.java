package fundamentos.contrutores;

public class BancoMain {
    public static void main(String[] args) {
        Banco banco = new Banco("Anderson", 20, false, 2.50);

        if(banco.casado){
            System.out.println("sim");
        } else{
            System.out.println("não");
        }

        String info = banco.infoPessois();

        System.out.println(info);
    }
}
