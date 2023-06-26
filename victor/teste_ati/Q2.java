public class Q2 {
    public static void main(String[] args) {
        Titular titular1 = new Titular();
        titular1.nome = "Victor";
        titular1.cpf = "123.456.789-10";

        ContaBancaria conta1 = new ContaBancaria(12345, 1000.0, titular1);
        conta1.depositar(500.0);
        conta1.verificarSaldo();
        conta1.sacar(200.0);
        conta1.verificarSaldo();

        Titular titular2 = new Titular();
        titular2.nome = "Julia";
        titular2.cpf = "987.654.321-60";

        ContaBancaria conta2 = new ContaBancaria(54321, 2000.0, titular2);
        conta2.depositar(1000.0);
        conta2.verificarSaldo();
        conta2.sacar(5000.0);
        conta2.sacar(500.0);
        conta2.verificarSaldo();
    }
}
