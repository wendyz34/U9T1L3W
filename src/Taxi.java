public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric,double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected= fareCollected;
    }
    public void printTaxi(){
        System.out.println("License plate: "+getLicensePlate());
        System.out.println("Toll fee: "+ getTollFee());
        System.out.println("Passengers: "+ getPassengers());
        System.out.println("Electric: "+ isElectric());
        System.out.println("Discount applied?: "+ isDiscountApplied());
        System.out.println("Total fare collected: "+ fareCollected);
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
}
