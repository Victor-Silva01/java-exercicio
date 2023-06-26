public class Q5 {
    public static void main(String[] args) {
        Raca raca1 = new Raca("Golden Retriever");
        Animal animal1 = new Animal("Buddy", 5, raca1);

        animal1.comer();
        animal1.dormir();
    }
}

    
