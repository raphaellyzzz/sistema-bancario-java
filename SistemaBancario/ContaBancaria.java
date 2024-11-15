package SistemaBancario;

public abstract class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
