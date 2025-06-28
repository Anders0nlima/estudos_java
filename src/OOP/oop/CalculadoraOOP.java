package OOP.oop;

public class CalculadoraOOP {
   private double resultado;

   public void somar(double num1, double num2){
       this.resultado = num1 + num2;
   }

   public double getResultado(){
       return resultado;
   }

}
