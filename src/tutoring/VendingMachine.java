package tutoring;

public class VendingMachine {

    private Soda soda = null;

    public VendingMachine(Soda soda)
    {
        this.soda = soda;
    }

    public Boolean addSoda(Soda soda) {
        if(this.soda == null) {
            this.soda = soda;
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean removeSoda() {
        if(this.soda == null) {
            return false;
        }
        else {
            this.soda = null;
            return true;
        }
    }
}