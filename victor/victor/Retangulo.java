public class Retangulo {
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }
}
