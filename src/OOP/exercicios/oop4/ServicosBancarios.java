package OOP.exercicios.oop4;



public interface ServicosBancarios {
    void transferir(Conta destino, double valor);
    void aplicarInvestimento(double valor, int meses);
}

