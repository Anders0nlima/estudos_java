package fundamentos.metodos;

public class Car {
   private String modelo;
   private int ano;

   public Car(String modelo, int ano){
       this.modelo = modelo;
       this.ano = ano;
   }

   public void displayModeloAndAno(){
       System.out.println("modelo: " + modelo);
       System.out.println("ano: "+ ano);

   }
}
