package fundamentos.metodos;

public class MainSub {
    public static void main(String[] args) {
     Subtracao(10, 5);
    }

    public static void Subtracao(int num1, int num2){
        int resultado = num1 - num2;
        System.out.println("A subtração dos seguites numeros ["+num1+","+num2+"]"+" é:" + resultado);
    }
}
