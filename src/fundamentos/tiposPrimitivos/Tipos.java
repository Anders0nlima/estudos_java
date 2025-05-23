package fundamentos.tiposPrimitivos;

import org.w3c.dom.ls.LSOutput;

public class Tipos {
    public static void main(String[] args) {
       /* int num1 = 1;
        int num2 = 2;

        int soma = (num1 + num2);

        System.out.println(soma);*/

       /* double num1 = 2.50;
        double num2 = 2.93;

        double soma = (num1 + num2);

        System.out.println(soma);*/

       /* double resultado = soma(4.5, 3.9);

        System.out.println(resultado);*/

        boolean resultado = igual(7, 8);

        System.out.println(resultado);
    }

    /*static double soma(double num1, double num2){
        return num1+num2;
    }*/

    static boolean igual(int num1, int num2){
        return num1 == num2;
    }


}
