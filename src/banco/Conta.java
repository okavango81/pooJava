package banco;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }else
            saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        } else if (saldo - valor < 0) {
            throw  new IllegalStateException("Saldo insuficiente");
        }  else
            saldo -= valor;
    }
}
