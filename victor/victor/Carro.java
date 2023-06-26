
public class Carro {
    public Modelo modelo;
    public Marca marca;
    public int anoFabricacao;
    public boolean ligado;

    public Carro(Modelo modelo, Marca marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("O carro foi ligado.");
        }
    }
}
