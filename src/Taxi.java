public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric,double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected= fareCollected;
    }
    public double getFareCollected(){
        return fareCollected;
    }
    public void pickupRiders(int numRiders, double farePerRider){
        int currentPassengerCount = getPassengers();
        newPassengers(currentPassengerCount+numRiders);

        double cost = numRiders*farePerRider;
        fareCollected += cost;

        if(getPassengers()>=4 && !isDiscountApplied()){
            newTollFee(getTollFee()*0.5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        int rider = getPassengers()-1;
        double fare = rider*farePerRider;
        fareCollected+=fare;
        boolean x = dropOffPassengers(rider);
        return x;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total fare collected: " +getFareCollected());
    }
}
