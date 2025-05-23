package fundamentos.caminhos.lugarPrivado;

public class lugarPrivado_dentro {
    public static void main(String[] args) {
        Apartamento apartamento = new Apartamento(); // agora que esses pasta está dentro eu consigo acessar
        Piscina piscina = new Piscina();
        System.out.println(piscina.getBoia());
        piscina.setBoia("Nova Boia");

    }
}
