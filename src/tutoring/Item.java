package tutoring;

import java.text.DecimalFormat;

public class Item {

    //    two fields
    public String name;
    public double price;
    private static DecimalFormat dp2 = new DecimalFormat("#.##");

    //    empty constructor
    public Item() {
    }

    //    constructor
    public Item(String name, String price) {
        this.name = name;
        this.price = Double.parseDouble(price);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    equals method
    public boolean equals(Item item) {
        return (item.getName().equals(this.getName()));
    }

    public String toString(){
        String out = "The " + this.getName() + " item has a price of$" + dp2.format(this.getPrice()) + ".";
        return out;
    }
}