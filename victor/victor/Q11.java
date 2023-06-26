public class Q11{
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S21";
        celular1.capacidadeArmazenamento = 256;
        celular1.enviarMensagem("Olá, tudo bem?", "987654321");
        celular1.fazerLigacao("987654321");
        
        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 12";
        celular2.capacidadeArmazenamento = 128;
        celular2.enviarMensagem("E aí, beleza?", "123456789");
        celular2.fazerLigacao("123456789");
    }
}

