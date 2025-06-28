package OOP.exercicios.procedural;

public class Procedural {
    public static void main(String[] args) {
        double largura1 = 5.0;
        double altura1 = 3.0;

        double area1 = calcularArea(largura1, altura1);
        double perimetro1 = calcularPerimetro(largura1, altura1);

        System.out.println("Área: " + area1);
        System.out.println("Perímetro: " + perimetro1);
    }

    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }
}
