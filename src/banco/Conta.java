package banco;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

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

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
