public class Animal {
    public String nome;
    public int idade;
    public Raca raca;

    public Animal(String nome, int idade, Raca raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo...");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo...");
    }
}

