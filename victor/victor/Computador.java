public class Computador {
    public String marca;
    public String modelo;
    public double tamanhoTela;
    public boolean ligado;

    public Computador(String marca, String modelo, double tamanhoTela) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.ligado = false;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O computador já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("O computador foi ligado.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
