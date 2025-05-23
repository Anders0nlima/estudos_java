package fundamentos.metodos;

public class soneca {
    public static void main(String[] args) {
        maisTempo();
        String mensagem = agendaHorario(12, 30); //argumentos (12, 30)
        System.out.println(mensagem);
    }

    static void maisTempo(){
        System.out.println("Só mais 5 minutinhos!");
    }

    static String agendaHorario(int hora, int minutos){ //parametro int hora, int minutos
        return "Seu horário foi redefinido para " + hora + ":" + minutos;
    }

}
