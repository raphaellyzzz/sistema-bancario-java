package SistemaBancario;

public class ContaPoupanca extends ContaBancaria {

    private double taxaJuros;

    public ContaPoupanca(String numeroConta, double taxaJuros) {
        super(numeroConta);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }
}
