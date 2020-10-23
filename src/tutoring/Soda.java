package tutoring;

public class Soda {

    private String name;
    private Double price;

    public Soda(String name, Double price)
    {
        this.name = name;
        this.price = price;
    }

    public Soda(Soda sodaToCopy) {
        this.name = sodaToCopy.name;
        this.price = sodaToCopy.price;
    }

    public String getName()
    {
        return this.name;
    }
    public Double getPrice()
    {
        return this.price;
    }
}