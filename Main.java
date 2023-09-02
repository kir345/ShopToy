public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(1, "Конструктор", 2);
        store.addToy(2, "Робот", 2);
        store.addToy(3, "Кукла", 6);


        store.play();

         try {
            store.getPrizeToy();
                                 
        } catch (Exception e) {
            
        }
    
    }
}