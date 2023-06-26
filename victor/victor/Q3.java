public class Q3 {
    public static void main(String[] args) {
        Modelo modelo1 = new Modelo();
        modelo1.nome = "Corolla";
        modelo1.ano = 2022;

        Marca marca1 = new Marca();
        marca1.nome = "Toyota";

        Carro carro1 = new Carro(modelo1, marca1, 2022);
        carro1.ligar();
      

    }
}
