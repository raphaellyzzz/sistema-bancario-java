package SistemaBancario;
import java.util.*;

public class SistemaBancario {
    private List<ContaBancaria> contas;

    public SistemaBancario() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void realizarSaque(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.sacar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void realizarDeposito(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.depositar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void consultarSaldo(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                System.out.println("Saldo: " + conta.consultarSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }
}
