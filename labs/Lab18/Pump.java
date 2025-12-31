package Lab18;

class Pump {
    private double gallons;
    // postcondition: sets number of gallons sold at this pump to 0.0
    public Pump() {
        gallons = 0.0;
    }
    // postcondition: returns the number of gallons sold at this pump
    public double gallonsSold() {
        return gallons;
    }
    // postcondition: resets number of gallons sold at this pump to 0.0
    public void resetGallonsSold() {
        gallons = 0.0;
    }
    // postcondition: adds sold number of gallons to gallons
    public void sellGallons(double sold) {
        gallons += sold;
    }
}

