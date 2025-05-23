package fundamentos.contrutores;

public class Calculadora {
  Double num1;
  Double num2;

  public Calculadora(double num1, double num2){
      this.num1 = num1;
      this.num2 = num2;
  }

  Double soma(){
      return num1 + num2;
  }


}

