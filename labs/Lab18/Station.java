package Lab18;

class Station {
    private double myBasePrice; // current price per gallon of gas for self-service pumps
    private Pump[] myPumps; // the list of gas pumps at the station
    public Station(double myBasePrice, Pump[] myPumps) {
        this.myBasePrice = myBasePrice;
        this.myPumps = myPumps;
    }
    // postcondition: returns the total cash value of sales for all pumps
    public double totalSales() {
        // to be implemented in Part B
        int i = 0;
        double totalSales = 0;
        while (i < 2){
            totalSales += this.myPumps[i].gallonsSold() * (this.myBasePrice + 0.25);
            i++;
        }
        while (i < myPumps.length){
            totalSales += this.myPumps[i].gallonsSold() * this.myBasePrice;
            i++;
        }
        return totalSales;
    }
    // postcondition: for every Pump p in this station
    // p.GallonsSold() is 0.0
    public void resetAll() {
        // to be implemented in Part A
        for (Pump p : myPumps){
            p.resetGallonsSold();
        }
    }
    // postcondition: returns the total cash value for every pump in this
    // station
    // resets every Pump in this station
    public double closeStation() {
        // to be implemented in Part C
        int i = 0;
        double totalSales = 0;
        while (i < 2){
            totalSales += this.myPumps[i].gallonsSold() * (this.myBasePrice + 0.25);
            this.myPumps[i].resetGallonsSold();
            i++;
        }
        while (i < myPumps.length){
            totalSales += this.myPumps[i].gallonsSold() * this.myBasePrice;
            this.myPumps[i].resetGallonsSold();
            i++;
        }
        return totalSales;
    }
    public static void main(String[] args) {
        Pump[] myPumps = new Pump[4];
        myPumps[0] = new Pump();
        myPumps[1] = new Pump();
        myPumps[2] = new Pump();
        myPumps[3] = new FixedCapacityPump(5.0);
        myPumps[0].sellGallons(5.3);
        myPumps[1].sellGallons(2.5);
        myPumps[2].sellGallons(6.0);
        myPumps[3].sellGallons(3.4);
        Station station = new Station(2.00, myPumps);
        System.out.println(station.totalSales());
        station.resetAll();
        System.out.println(station.totalSales());
        myPumps[0].sellGallons(2.5);
        myPumps[1].sellGallons(5.67);
        myPumps[2].sellGallons(3.25);
        myPumps[3].sellGallons(6.8);
        System.out.println(station.closeStation());
    }
}

