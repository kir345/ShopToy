public class Toy {
    private int id;
    private String name;
    private double rate;

    public Toy(int id, String name,double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public double getRate() {
        return rate;
    }


    public void setRate(double rate) {
        this.rate = rate;
    }
}

