public class Q10 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell", "Inspiron", 15.6);
        System.out.println("O computador está ligado? " + computador1.isLigado());
        computador1.ligar();
        System.out.println("O computador está ligado? " + computador1.isLigado());
        computador1.ligar();
    }
}
