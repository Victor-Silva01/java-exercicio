public class Q9 {
    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Gerente de Vendas");
        Funcionario funcionario1 = new Funcionario("João da Silva", 5000.0, cargo1);

        System.out.println("Salário antes do aumento: " + funcionario1.getSalario());
        funcionario1.aumentarSalario();
        System.out.println("Salário depois do aumento: " + funcionario1.getSalario());
    }
}
