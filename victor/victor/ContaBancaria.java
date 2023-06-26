
public class ContaBancaria {
    public int numeroConta;
    public double saldo;
    public Titular titular;

    public ContaBancaria(int numeroConta, double saldo, Titular titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito no valor de " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
