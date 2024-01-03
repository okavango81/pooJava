package banco;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

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

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
