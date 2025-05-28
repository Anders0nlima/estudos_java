package fundamentos.contrutores;

public class Banco {
    String nome;
    int idade;
    boolean casado;
    double codigo;


    public Banco(String nome, int idade, boolean casado, double codigo) {
        this.nome = nome;
        this.idade = idade;
        this.casado = casado;
        this.codigo = codigo;
    }


    String infoPessois() {
        String estadoCivil = casado ? "sim" : "não";
        return "Bem vindo " + nome + " confirme suas informações: \nidade: " + idade + "\ncodigo:" + codigo + "\nestado civil:" + estadoCivil;
    }

}
