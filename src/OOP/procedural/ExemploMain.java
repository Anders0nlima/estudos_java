package OOP.procedural;

public class ExemploMain {
    public static void main(String[] args) {
        double[] numeros = {5.0, 3.0};

        double soma = somar(numeros[0], numeros[1]);
        System.out.println(soma);
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }
}
