package fundamentos.classes;

public class Despertador {
    int minutos;
    int horas;
    int soneca;

    void ativarSoneca(){
        System.out.println("So mais "+ soneca + " minutinhos!");
    }

    String agendaAlarme(){
        return "Seu alarme foi configurado para "+ horas +":"+ minutos;
    }


}
