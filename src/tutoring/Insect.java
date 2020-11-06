package tutoring;

public class Insect implements Bug {
    private String name = "";
    private Integer legs = 6;

    public Insect() {}

    public Insect(String name) {
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
