package fundamentos.metodos;

public class Soma {
    int num1;
    int num2;

   public Soma(int num1, int num2) { //paramentros
        this.num1 = num1;
        this.num2 = num2;
    }

    public void DisplaySoma(){
        int resultado = num1 + num2;
        System.out.println("A soma do primeiro valor "+num1 + " mais o segundo valor " + num2 + " é: " + (resultado));
    }
}
