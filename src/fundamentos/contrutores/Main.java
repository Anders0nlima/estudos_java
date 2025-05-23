package fundamentos.contrutores;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1.3, 4.5);
        double resultado = calculadora.soma();
        System.out.println(resultado);
    }

}
