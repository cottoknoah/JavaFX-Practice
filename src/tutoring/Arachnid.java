package tutoring;

public class Arachnid implements Bug {
    private String name = "";
    private Integer legs = 8;

    public Arachnid() {}

    public Arachnid(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getNumberOfLegs() {
        return this.legs;
    }
    public String toString() {
        return "The " + this.name + " is an Arachnid. It has " + this.legs + " legs.";
    }

}
