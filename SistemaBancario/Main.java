package SistemaBancario;

public class Main {
    public static void main(String[] args) {
        SistemaBancario sistema = new SistemaBancario();

        ContaCorrente conta1 = new ContaCorrente("12345", 1000);
        ContaPoupanca conta2 = new ContaPoupanca("67890", 0.05);

        sistema.adicionarConta(conta1);
        sistema.adicionarConta(conta2);

        sistema.realizarDeposito("12345", 500);
        sistema.realizarSaque("12345", 200);
        sistema.consultarSaldo("12345");

        sistema.realizarDeposito("67890", 1000);
        sistema.consultarSaldo("67890");

        // Aplicando juros na conta poupança
        conta2.aplicarJuros();
        sistema.consultarSaldo("67890");
    }
}
