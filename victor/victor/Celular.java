public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeArmazenamento;
    
    public void enviarMensagem(String mensagem, String numero) {
        System.out.println("Enviando mensagem: " + mensagem + " para o número " + numero);
    }
    
    public void fazerLigacao(String numero) {
        System.out.println("Realizando ligação para o número " + numero);
    }
    
}