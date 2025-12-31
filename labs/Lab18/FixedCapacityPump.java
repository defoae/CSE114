package Lab18;

class FixedCapacityPump extends Pump {
    private double capacity;
    public FixedCapacityPump(double capacity) {
        super();
        this.capacity = capacity;
    }

    @Override
    public void sellGallons(double sold){
        if(this.gallonsSold() + sold < capacity){
            super.sellGallons(sold);
        }
    }
}

