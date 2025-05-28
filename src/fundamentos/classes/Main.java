package fundamentos.classes;

public class Main {
    public static void main(String[] args) {
        Despertador despertador = new Despertador();
        despertador.horas = 7;
        despertador.soneca = 10;
        despertador.minutos = 30;

        despertador.ativarSoneca();
        System.out.println(despertador.agendaAlarme());

    }
}
