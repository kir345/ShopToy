
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }


    public void addToy(int id, String name, double rate) {
        Toy toy = new Toy(id, name, rate);
        toys.add(toy);
    }

    public void setToyRate(int id, double rate) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setRate(rate);
                break;
            }
        }
    }


    public void play() {
        double totalRate = 0;
        for (Toy toy : toys) {
            totalRate += toy.getRate();
        }
    

    Random rand = new Random();
    double randomNumber = rand.nextDouble() * totalRate;
    Toy prizeToy = null;
    for (Toy toy : toys) {
        if (randomNumber < toy.getRate()) {
            prizeToy = toy;
            break;
            }
        randomNumber -= toy.getRate();
        }

        if (prizeToy != null && prizeToy.getRate() > 0) {
            prizeToys.add(prizeToy);

            prizeToy.setRate(prizeToy.getRate() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {

            Toy prizeToy = prizeToys.remove(0);
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write(prizeToy.getId() + "," + prizeToy.getName() + "," + prizeToy.getRate() + "\n");
            writer.close();
        }
    }
}

